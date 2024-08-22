package vn.devpro.javaweb27.controller.frontend;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import vn.devpro.javaweb27.controller.BaseController;
import vn.devpro.javaweb27.dto.Contact;

@Controller
public class ContactController extends BaseController{
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact (final Model model,
			final HttpServletRequest request,
			final HttpServletResponse response) throws IOException{
		return "frontend/contact/contact";
	}
		@RequestMapping(value = "/contact-send", method = RequestMethod.GET)
		public String contactSend(final Model model,
				final HttpServletRequest request,
				final HttpServletResponse response) throws IOException{
			
			Contact contact = new Contact();
			//lấy dữ liệu từ from
			String name = request.getParameter("txtName");
			System.out.println("Name:" +contact.getName());
			return "frontend/contact/contact";
		}
		@RequestMapping(value = "/contact-edit", method = RequestMethod.GET)
		public String contactEdit (final Model model,
				final HttpServletRequest request,
				final HttpServletResponse response) throws IOException{
			Contact contact = new Contact("Cường Vũ","vucuong2711@gmail.com","0979929942",
					"Tiên thiên Giới","Chuyển kiếp cấp độ kim tiên");
			model.addAttribute("contact", contact);
			return "frontend/contact/contact-edit";
		}
		@RequestMapping(value = "/contact-edit-save", method = RequestMethod.POST)
		public ResponseEntity<Map<String,Object>> contactEditSave (final Model model,
				final HttpServletRequest request,
				final HttpServletResponse response,
				@RequestBody Contact contact
				) throws IOException{
			System.out.println(contact.getName());
			// sau khi lưu và dữ liệu và db
			Map<String,Object> jsonResult = new HashMap<String, Object>();// gửi lại view
			jsonResult.put("code", 200);
			jsonResult.put("message","cảm ơn"+contact.getName()+ "đã gửi thông tin");
			return ResponseEntity.ok(jsonResult);
		}
		
		@RequestMapping(value = "/contact-sf", method = RequestMethod.POST)
		public String contactSf (final Model model,
				final HttpServletRequest request,
				final HttpServletResponse response) throws IOException{
			
			model.addAttribute("contact", new Contact());
			return "frontend/contact/contact-sf";
		}
		@RequestMapping(value = "/contact-sf-save", method = RequestMethod.GET)
		public String contactSfSave (final Model model,
				final HttpServletRequest request,
				final HttpServletResponse response,
				@ModelAttribute("contact") Contact contact, // get data from
				@RequestParam("contactFile") MultipartFile contactFile
				) throws IOException{
			System.out.println(contact.getName());
			System.out.println(contact.getMobile());
			
			
			return "redirect:/frontend/contact/contact-sf";
		}
		@RequestMapping(value = "/contact-sf-edit", method = RequestMethod.GET)
		public String contactSfEdit (final Model model,
				final HttpServletRequest request,
				final HttpServletResponse response) throws IOException{
			Contact contact = new Contact("Cường Vũ","vucuong2711@gmail.com","0979929942",
					"Tiên thiên Giới","Chuyển kiếp cấp độ kim tiên");
			model.addAttribute("contact", contact);
			return "frontend/contact/contact-sf-edit";
		}
}
