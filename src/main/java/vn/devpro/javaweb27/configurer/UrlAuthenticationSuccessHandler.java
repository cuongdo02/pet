package vn.devpro.javaweb27.configurer;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthoritiesContainer;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import aj.org.objectweb.asm.Handle;

// class theo de chuyen cac request khac nhau
public class UrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		 handle(request, response, authentication);
		 clearAuthenticationAttributes(request);
	}

	protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication) 
	throws IOException {
		// TODO Auto-generated method stub
		String targetUrl = determineTargetUrl(authentication);
		// lấy url theo role của user login
		if(response.isCommitted()) {
			return;
		}
		RedirectStrategy.sendRedirect(request, response, targetUrl);
		// điều hướng targer Url
	}
// lấy role của user và trả về Url(action) tương ứng với authentication
	protected String determineTargetUrl(final Authentication authentication) 
	throws IllegalStateException{
		// TODO Auto-generated method stub
		Map<String, String> roleTargetUrMap = new HashMap<String, String>();
		// key là role name, value là Url (action)
		roleTargetUrMap.put("ADMIN", "/admin/home");
		roleTargetUrMap.put("GUEST", "/index");
		
		final Collection<? extends GrantedAuthority> authorities = 
				authentication.getAuthorities(); // lấy danh sách các roles
		for(final GrantedAuthority grantedAuthority : authorities) {
			
			String authorityName = grantedAuthority.getAuthority();
			//role name
			if(roleTargetUrMap.containsKey(authorityName)) {
				return roleTargetUrMap.get(authorityName);
				// trả về target url của user đăng nhập
			}
		}
		throw new IllegalStateException();
	}

	protected void clearAuthenticationAttributes(HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if(session == null) {
			return;
		}
		session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
	}
}
	

