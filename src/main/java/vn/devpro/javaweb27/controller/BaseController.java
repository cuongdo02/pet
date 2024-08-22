package vn.devpro.javaweb27.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.ModelAttribute;

@Configuration
public class BaseController {
	@ModelAttribute("title")
	public String projectTitle() {
		return "Javaweb 27";
	}
	//
	@ModelAttribute("loginedUser")
	public User getLoginedUser() {
		Object loginedUser = 
				SecurityContextHolder.getContext().getAuthentication()
		.getPrincipal();
		if(loginedUser != null && loginedUser instanceof UserDetails) {
			User user = (User) loginedUser;
			return user;
		}
		return new User();
	}
	// kiểm tra đã login hay chưa
	@ModelAttribute("isLogined")
	public boolean isLogined() {
		Object loginedUser = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		if(loginedUser != null && loginedUser instanceof UserDetails) {
			return true;
		}
		return false;
	}
//	private void getPrincipal() {
//		// TODO Auto-generated method stub
//		cart- view dòng 155 sửa thành loginedUser 
//	}
}
