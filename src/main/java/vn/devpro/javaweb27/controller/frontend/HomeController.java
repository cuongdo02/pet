package vn.devpro.javaweb27.controller.frontend;

import java.io.IOError;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.devpro.javaweb27.controller.BaseController;


@Controller
public class HomeController extends BaseController{

	@RequestMapping(value = "/index", method = RequestMethod.GET)
//@RequestMapping : ánh xạ 1 action đến 1 action method trong controller
	public String index(final Model model,
			final HttpServletRequest request,
			final HttpServletResponse response) throws IOException{
		return "frontend/index";
	}
}
