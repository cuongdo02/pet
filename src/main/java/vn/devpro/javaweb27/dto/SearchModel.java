package vn.devpro.javaweb27.dto;

public class SearchModel {
	private int categoryId;
	private String keyword;
	private int status;
	private String beginDate;
	private String endDate;
	private int sizeOfpage; // số bản ghi trên 1 trang
	private int currentPage; // Trang hiện tại
	private int totalItems; // Tổng số bản ghi tìm kiếm được
	private int totalPages; // tổng số trang
	public SearchModel() {
		super();
	}
	public SearchModel(int categoryId, String keyword, int status, String beginDate) {
		super();
		this.categoryId = categoryId;
		this.keyword = keyword;
		this.status = status;
		this.beginDate = beginDate;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	
}
