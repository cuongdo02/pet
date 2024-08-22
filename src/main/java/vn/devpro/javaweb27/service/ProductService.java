package vn.devpro.javaweb27.service;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

import vn.devpro.javaweb27.model.Product;
import vn.devpro.javaweb27.model.ProductImage;
import vn.devpro.javaweb27.dto.Jw27Constant;
import vn.devpro.javaweb27.dto.SearchModel;
import vn.devpro.javaweb27.model.Category;
import vn.devpro.javaweb27.model.Product;
@Service
public class ProductService extends BaseService<Product> implements Jw27Constant {

//    private ProductRepository productRepository;
//
//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    private static final String FODER_UPLOAD = null;
private static final String FOLDER_UPLOAD = null;
	@Override
    public Class<Product> clazz() {
        return Product.class;
    }

    public List<Product> findAllActive(){
		return super.executeNativeSql("SELECT * FROM tbl_Category WHERE status=1");
	}
    // hàm kiểm tra 1 file có được upload  không
    public boolean isUploadFile(MultipartFile file) {
    	if(file == null || file.getOriginalFilename().isEmpty()) {
    		return false;
    	}
    	return true;
    }
    // hàm kiểm tra danh sách file có upload file nào không
    public boolean isUploadFile(MultipartFile[] files) {
    	if(files == null || files.length == 0) {
    		return false; // không upload file nào
    	}
    	return true; // có upload ít nhất 1 file
    }
    //Save new product
    @Transactional
    public Product saveAddProduct(Product product, MultipartFile avatarFile,
    		MultipartFile[] imageFiles) throws IOException{
    	// lưu avatar file
    	if(isUploadFile(avatarFile)) { //có upload file avatar
    		// lưu file vào thư mục product/avatar
    		String path = (FODER_UPLOAD + "Product/Avatar/" + avatarFile.getOriginalFilename());
    		File file = new File(path);
    		avatarFile.transferTo(file);
    		//lưu đường dẫn vào bảng tbl_product
    		product.setAvatar("Product/Avatar/" + avatarFile.getOriginalFilename());
    	}
    	if(isUploadFile(imageFiles)) {
    		// duyệt danh sách file image
    		for (MultipartFile imageFile : imageFiles) {
				if(isUploadFile(imageFile)) {
					
					String path = FODER_UPLOAD + "product/Image" + imageFile.getOriginalFilename();
					File file = new File(path);
					imageFile.transferTo(file);
					
					// lưu đường dẫn vào tbl_product_image
					ProductImage productImage = new ProductImage();
					productImage.setTitle(imageFile.getOriginalFilename());
					productImage.setPath("Product/Image/" + imageFile.getOriginalFilename());
					productImage.setStatus(Boolean.TRUE);
					productImage.setCreateDate(new Date());
					
					// lưu đường dẫn ảnh sang  tbl_product_image
					product.addRelationalProductImage(productImage);
				}
			}
    	}
		return super.saveOrUpdate(product);
    }
    
    //-- save edit product
    @Transactional
    public Product saveEditProduct( Product product, MultipartFile avatarFile,
    		MultipartFile[] imageFiles) throws IOException{
    // lấy product trong DB
    	Product dbProduct = super.getById(product.getId());
    	
    	// lưu avatar file mới nếu người dùng có upload avatar
    	if(isUploadFile(avatarFile)) { // có upload file avatar
    		
    		//xóa avatar cũ
    		String path = FOLDER_UPLOAD + dbProduct.getAvatar();
    		File file = new File(path);
    		file.delete();
    		
    		// lưu file avatar mới thư mục product/avtar
    		path =  FOLDER_UPLOAD + "Product/Avatar/" + avatarFile.getOriginalFilename();
    		file = new File(path);
    		avatarFile.transferTo(file);
    		// lưu đường dẫn của avar mới vào bảng tbl_product
    		product.setAvatar("Product/Avatar/" + avatarFile.getOriginalFilename());
    	}
    	else { // Người dùng không upload avatar file
    		// giữ nguyên avatar cũ
    		product.setAvatar(dbProduct.getAvatar());
    	}
    	if(isUploadFile(imageFiles)) { // có upload danh sách ảnh
    		// duyệt danh sách file images
    		for (MultipartFile imageFile : imageFiles) {
				if(isUploadFile(imageFile)) { //file có upload
					// lưu file vào thư mục Product/Image
					String path = FOLDER_UPLOAD + "Product/Image/" +imageFile.getOriginalFilename();
					File file = new File(path);
					imageFile.transferTo(file);
					
					// lưu đường dẫn vào tbl_product_image
					ProductImage productImage = new ProductImage();
					productImage.setTitle(imageFile.getOriginalFilename());
					productImage.setPath("Product/Image/" + imageFile.getOriginalFilename());;
					productImage.setStatus(Boolean.TRUE);
					productImage.setCreateDate(new Date());
					
					// lưu đối tượng product image đường dẫn ảnh sang bản tbl_product_image
					product.addRelationalProductImage(productImage);
				}
			}
    	}
    	return super.saveOrUpdate(product);         
    }
    //-delete product
    @Autowired
    private ProductImageService productImageService;
    @Transactional
    public void deleteProduct(Product product) {
    	// lấy danh sách ảnh của product trong tbl_product_image
    	String sql ="SELECT * FROM tbl_product_image WHERE product_id=" +product.getId();
    	List<ProductImage> productImages = productImageService.executeNativeSql(sql);
    	// xóa lần lượt các ảnh của product trong Product/Image và
    	// xóa lần lượt các đường dẫn ảnh trong tbl_product_image
    	for (ProductImage productImage : productImages) {
			//xóa file trong thư mục Product image(trước)
    		String path = FOLDER_UPLOAD + productImage.getPath();
    		File file = new File(path);
    		file.delete();
    		// xóa bản ghi thông tin ảnh trong tbl_product_image
//    		product.removeRelationalProductImage(productImage); có thể thực hiện hoặc không cũng được
		}
    	// xóa file avtar trong thư mục Product/Avatar
    	String path = FOLDER_UPLOAD + product.getAvatar();
    	File file = new File(path);
		file.delete();
		
		// xóa product trong db
		super.delete(product);	
    }
    
    //-----searchProduct
    public List<Product> searchProduct(SearchModel productSearch){
    	// tạo câu lệnh Sql
    	String sql ="SELECT * FROM tbl_product p WHERE 1=1" ;
    	// tìm kiếm theo tiêu chí status
    	if(productSearch.getStatus() !=2) { // có chọn active/inactive
    		sql += " AND p.status=" + productSearch.getStatus();
    		
    	}
    	// tìm kiếm theo tiêu chí catagory
    	if(productSearch.getCategoryId() != 0) {
    		sql += " AND p.categpry_id=" + productSearch.getCategoryId();
    	}

    	// tìm kiếm theo keyword
    	if(!StringUtils.isEmpty(productSearch.getKeyword())) {
    		String keyword = productSearch.getKeyword().toLowerCase();
    		
    		sql +=  " AND (LOWER(p.name) like '%" +keyword + "%'" +
    				" OR LOWER(p.short_description) like '%" + keyword + "%'" +
    				" OR LOWER(p.seo) like '%" + keyword + "%')";
    	}
    	
    	return super.executeNativeSql(sql);
    }
    
    // Tìm kiếm với ngày tháng
//    if(!StringUtils.isEmpty(productSearch.getBeginDate())
//    		&& !StringUtils.isEmpty(productSearch.getEndDate())) {
//    	String beginDate = productSearch.getBeginDate();
//    	String endDate = productSearch.getEndDate();
//    	sql = "AND p.create_date BETWEEN '" + beginDate + "'AND'" +endDate + "'" ;
//    }
//    return super.executeNativeSql(sql);
}