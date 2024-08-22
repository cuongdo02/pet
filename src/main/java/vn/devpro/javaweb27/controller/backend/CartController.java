package vn.devpro.javaweb27.controller.backend;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import antlr.StringUtils;
import vn.devpro.javaweb27.model.SaleOrder;
import vn.devpro.javaweb27.model.User;
import vn.devpro.javaweb27.service.ProductService;

public class CartController {
	@Autowired
	private SaleOrderService saleOrderService;
// Hiển thị giỏ hàng
	@RequestMapping(value ="/cart-view", method = RequestMethod.GET)
	public String cartview (final Model model, final HttpServletRequest request) throws IOException{
	HttpSession session = request.getSession();
	if(session.getAttribute("cart") != null) {
		Cart cart = (Cart) session.getAttribute("cart");
		model.addAllAttributes("totalCartPrice", cart.totalCartPrice());
		String message ="co tong cộng" + cart.totalCartProduct()+ "san pham gio hang";
		model.addAllAttributes("message", message);
	}
	else {
		String errorMessage = "khong co san phẩm nào trong giỏ hàng";
		model.addAllAttributes("errorMessage",errorMessage);
	}
	return "frontend/cart-view";
	}

	// thêm bớt sản phẩm trong giỏ hàng
	@RequestMapping(value ="/update-product-quantity", method = RequestMethod.POST)
	ResponseEntity<Map<String,Object>> updateProductQuantity(
			RequestBody ProductCart productCart, 
			final HttpServletRequest request ) throws IOException{
	HttpSession session = request.getSession();
	if(session.getAttribute("cart") != null) {
		Cart cart = (Cart) session.getAttribute("cart");
		// cập nhập số lượng
		int index = cart.findProductById(productCart.getProductById());
		BigInteger oldQuantity = cart.getproductCarts().get(index).getQuantity();
		BigInteger newQuantity = oldQuantity.add(productCart.getQuantity()); //-1, +1
		if(newQuantity.intValue()<1) {
			newQuantity = BigInteger.ONE;
		}
		cart.getProductCarts().get(index).setQuantity(newQuantity);
		jsonResult.put("newQuantity", newQuantity);
	}
	jsonResult.put("productId", productCart.getProductId());
	return ResponseEntity.ok(jsonResult);
}
	// thêm bớt sản phẩm trong giỏ hàng
		@RequestMapping(value ="/place-order", method = RequestMethod.POST)
		ResponseEntity<Map<String,Object>> placeOrder(
				RequestBody Customer customer , 
				final HttpServletRequest request ) throws IOException{
			Map<String, Object> jsonResult = new HashMap<String, Object>();
			
		// kiểm tra thông tin customer bắt buộc
			if(StringUtils.isEmpty(customer.getTxtName())) {
				jsonResult.put("message", "bạn chưa nhập họ tên");
			}
			else if(customer.getTxtName()== null || customer.getTxtName().length() <= 0) {
				jsonResult.put("message", "bạn chưa nhập số điện thoạt");
			}else {
				HttpSession session = request.getSession();
				if(session.getAttribute("cart")== null) {
					jsonResult.put("message", "bạn chưa có giỏ hàng");
				}
				else {
					Cart cart = (Cart) session.getAttribute("cart");
					// lưu các sản phẩm trong giỏ hàng vào tbl_sale_order_product
					SaleOrder saleOrder = new SaleOrder();
					for (ProductCart productCart : cart.getProductCarts()) {
						SaleOrderProduct saleOrderProduct = new SaleOrderProduct();
						SaleOrderProduct saleOrderProduct = new saleOrderProduct();
						
						// lấy product trong db
						Product dbProduct = ProductService.getById(productCart.getProductId());
						saleOrderProduct.setProduct(dbProduct);
						saleOrderProduct.setQuantity(productCart.getQuantity().intValue());
						
						saleOrder.addRelationalSealeOrderProduct(saleOrderProduct);
						
					}
					// lưu đơn hàng vào tbl_sale_order
					Calendar cal = Calendar.getInstance();
					String Code = cal.get(Calendar.YEAR) + cal.get(Calendar.MONTH) + 
							cal.get(Calendar.DAY_OF_MONTH) + customer.getTxTMobile +
					 saleOrder.setCode(code);
					User user = new User();
					user.setId(1);
					saleOrder.setUser(user);
					
					saleOrder.setCustomerName(customer.getTxtName());
					saleOrder.setCustomerMobile(customer.getTxtMobile());
					saleOrder.setCustomerEmail(customer.getTxtEmail());
					saleOrder.setCustomerAddress(customer.getTxtAddress());
					
					saleOrder.setTotal(cart.totalCartPrice());
					saleOrderService.saveOrUpdate(saleOrder);
					jsonResult.put("message", "bạn đã đặt hàng thành công, cảm ơn bạn");
					
					
					// xóa giỏi hàng sau khi đặt hàng
					cart = new Cart();
					session.setAttribute("cart", cart);
					
				}
				return ResponseEntity.ok(jsonResult);
			}
			
		
}
}
