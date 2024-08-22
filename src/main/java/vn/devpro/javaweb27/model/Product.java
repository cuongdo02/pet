package vn.devpro.javaweb27.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "tbl_product")
public class Product extends BaseModel {
	
	@Column(name = "name", length = 450, nullable = false)
	private String name;

	@Column(name = "price", nullable = true)
	private BigDecimal price;

	@Column(name = "sale_price", nullable = true)
	private BigDecimal salePrice;

	@Column(name = "is_hot", nullable = true)
	private Boolean isHot = Boolean.FALSE;

	@Column(name = "short_description", length = 400, nullable = true)
	private String shortDescription;

	@Column(name = "detail_description", nullable = true)
	private String detailDescription;

	@Column(name = "seo", length = 1000, nullable = true)
	private String seo;
	
//	---------Mapping many-to-one: product-to-category----------
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id")
	private Category category;

	private String avatar;

	public Product() {
		super();
	}

	

	public Product(Integer id, Date createDate, Date updateDate, Boolean status, String name, BigDecimal price,
			BigDecimal salePrice, Boolean isHot, String shortDescription, String detailDescription, String seo,
			Category category) {
		super(id, createDate, updateDate, status);
		this.name = name;
		this.price = price;
		this.salePrice = salePrice;
		this.isHot = isHot;
		this.shortDescription = shortDescription;
		this.detailDescription = detailDescription;
		this.seo = seo;
		this.category = category;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar();
	}
	private String avatar() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public Boolean getIsHot() {
		return isHot;
	}

	public void setIsHot(Boolean isHot) {
		this.isHot = isHot;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}

	public String getSeo() {
		return seo;
	}

	public void setSeo(String seo) {
		this.seo = seo;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	//-----------------Mapping many-to-one: tbl_product-to-tbl_user (for create product)----------------------------	
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "create_by")
		private User userCreateProduct;

	//----------------Mapping many-to-one: tbl_product-to-tbl_user (for update product)-------------------------------
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "update_by")
		private User userUpdateProduct;

		public User getUserCreateProduct() {
			return userCreateProduct;
		}



		public void setUserCreateProduct(User userCreateProduct) {
			this.userCreateProduct = userCreateProduct;
		}



		public User getUserUpdateProduct() {
			return userUpdateProduct;
		}



		public void setUserUpdateProduct(User userUpdateProduct) {
			this.userUpdateProduct = userUpdateProduct;
		}
		
		// Mapping one-to-many
				@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
				private Set<ProductImage> productImages = new HashSet<ProductImage>();

				//add and remove elements 
				public void addRelationalProductImage(ProductImage productImage) {
					productImages.add(productImage);
					productImage.setProduct(this);
				}
				public void removeRelationalProductImage(ProductImage productImage) {
					productImages.remove(productImage);
					productImage.setProduct(null);
				}



				public Set<ProductImage> getProductImages() {
					return productImages;
				}



				public void setProductImages(Set<ProductImage> productImages) {
					this.productImages = productImages;
				}
//Mapping one to many: tbl_product - to-tbl_product_image
				


				
				
}
