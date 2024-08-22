package vn.devpro.javaweb27.controller.backend;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.mysql.cj.util.StringUtils.SearchMode;
import com.sun.net.httpserver.HttpServer;

import vn.devpro.javaweb27.controller.BaseController;
import vn.devpro.javaweb27.dto.Jw27Constant;
import vn.devpro.javaweb27.dto.SearchModel;
import vn.devpro.javaweb27.model.Category;
import vn.devpro.javaweb27.model.Product;
import vn.devpro.javaweb27.service.CategoryService;
import vn.devpro.javaweb27.service.ProductService;
import vn.devpro.javaweb27.service.UserService;

@Controller
@RequestMapping("/admin/product/")
public class ProductController extends BaseController implements Jw27Constant{
	@Autowired
	private CategoryService categoryService;

	@Autowired
	private UserService userService;
	
	@Autowired 
	private ProductService productService;
//	
//	@RequestMapping(value = "list", method = RequestMethod.GET)
//	public String list(final Model model) {
//		
//    List<Product> products = productService.findAll();
//  //  List<Product> products = productService.findAllActive();
//		model.addAttribute("products", products);
//		return "backend/product-list";
//	}
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(final Model model,
			final HttpServletRequest request) {
		
		SearchModel productSearch = new SearchModel();
		
		//tìm theo status
		productSearch.setStatus(2); //All
		String status = request.getParameter("status");
		if(!StringUtils.isEmpty(status)) { //có chọn status
			productSearch.setStatus(Integer.parseInt(status));
		}
		// tìm theo catagory
		productSearch.setCategoryId(0); //All
		String categoryId = request.getParameter("categoryId");
		if(!StringUtils.isEmpty(categoryId) ) { //có chọn category
			productSearch.setCategoryId(Integer.parseInt(categoryId));
		}
		
		//tim theo keyworld
		productSearch.setKeyword(null);
		String keyword = request.getParameter("keyword");
		if(!StringUtils.isEmpty(keyword) ) { //có chọn category
			productSearch.setKeyword(keyword);
		}
	
	    List<Category> categories = categoryService.findAllActive();
			model.addAttribute("categories", categories);
		
		List<Product> products = productService.searchProduct(productSearch);
		model.addAttribute("products",products);

		return "backend/product-list";
	}
	
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(final Model model) {
		
		List<vn.devpro.javaweb27.model.User> users = userService.findAll();
		model.addAttribute("users", users);
		
	    List<Category> categories = categoryService.findAllActive();
			model.addAttribute("categories", categories);
		 
		Product product = new Product();
		product.setCreateDate(new Date());
			
		model.addAttribute("product", new Product());
		
		return "backend/product-add";
	}
	
//	--save new product
	@RequestMapping(value= "/add-save", method = RequestMethod.POST)
	public String prroductAddSave( final Model model,
			@ModelAttribute("product") Product product,
			@RequestParam("avatarFile") MultipartFile avatarFile,
			@RequestParam("imageFiles")MultipartFile[] imageFiles) throws IOException{
		productService.saveAddProduct(	product, avatarFile, imageFiles);
		return "redirect:/admin/product/add";
	}
	
	@RequestMapping(value = "edit/{productId}", method = RequestMethod.GET)
	public String edit(final Model model, @PathVariable("productId") int productId) {
		
		List<vn.devpro.javaweb27.model.User> users = userService.findAll();
		model.addAttribute("users", users);
//		
	    List<Category> categories = categoryService.findAllActive();
			model.addAttribute("categories", categories);
		 
		// lấy product trong dB
		Product product = productService.getById(productId);
		product.setUpdateDate(new Date());
		
		model.addAttribute("product", new Product());
		
		return "backend/product-edit";
	}
	
//	--edit product
	@RequestMapping(value= "/edit-save", method = RequestMethod.POST)
	public String prroductEditSave( final Model model,
			@ModelAttribute("product") Product product,
			@RequestParam("avatarFile") MultipartFile avatarFile,
			@RequestParam("imageFiles")MultipartFile[] imageFiles) throws IOException{
		
		productService.saveEditProduct(	product, avatarFile, imageFiles);
		return "redirect:/admin/product/list";
	}
	
	//--- delete product
//	@RequestMapping(value = "delete/{productId}", method = RequestMethod.GET)
//	public String delete(final Model model, @PathVariable("productId") int productId) {
//		
//		 
//		// lấy product trong dB
//		Product product = productService.getById(productId);
//
//		productService.deleteProduct(product);
//		
//		return "redirect:/admin/product/list";
//	}
	
	//Inactive product
	@RequestMapping(value = "delete/{productId}", method = RequestMethod.GET)
	public String delete(final Model model, @PathVariable("productId") int productId) {
		
		 
		// lấy product trong dB
		Product product = productService.getById(productId);
		
		product.setStatus(false);
		productService.saveOrUpdate(product);
		
		return "redirect:/admin/product/list";
	}
	
	// Kiem tra tieu chi tim kiem tu ngay den ngay
//			String beginDate = null;
//			String endDate = null;
//			if (!StringUtils.isEmpty(request.getParameter("beginDate"))
//					&& !StringUtils.isEmpty(request.getParameter("endDate"))) {
//				beginDate = request.getParameter("beginDate");
//				endDate = request.getParameter("endDate");
//			}
//			productSearch.setBeginDate(beginDate);
//			productSearch.setEndDate(endDate);
//}
	
	// bắt đầu phân trang
//	if(!StringUtils.isEmpty(request.getParameter))
}
