package vn.devpro.javaweb27.configurer;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



import vn.devpro.javaweb27.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecureConfigurer extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(final HttpSecurity http) throws Exception{
		// bắt đầu cấu hình 
		http.csrf().disable().authorizeRequests() // bắt các request từ brower
		
		// cho phép các request, static resources không bị rành buộc login
		.antMatchers("/frontend/**", "/backend/**", "/FileUploads/**", "/login/", "/logout/").permitAll()
		
		// các request kiểu "/admin/**" phải login xác thực
//		.antMatchers("/admin/**").authenticated() // step 1 +2 
		// các request kiểu admin phải có role là ADMIN // step 3
		.antMatchers("/admin/**").hasAnyAuthority("ADMIN")
		.and()
		// nếu chưa login (xác thực) thì redirect đến trang login
		
		// với "/login/" là 1 request( trong LoginController)
		.formLogin().loginPage("/login").loginProcessingUrl("/login_processing_url")
		
//		.defaultSuccessUrl("/admin/home", true) // login thành công thì vào trang home
		// backend step 1+2
		
		// Login thành công: chuyển đến request phù hợp với role step 3
		.successHandler(new UrlAuthenticationSuccessHandler())
		
		// login không thành công
		.failureUrl("/login?login_error=true")
		
		.and()
		
		// ccaasu hình phần logout
		.logout().logoutUrl("/logout").logoutSuccessUrl("/index").invalidateHttpSession(true)
		.deleteCookies("JSEESIONID")
		.and()
		.rememberMe().key("uniqueAndSecret").tokenValiditySeconds(86400);
	}
	
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder(4));
	}
//	public static void main(String[] args) {
//		System.out.println(new BCryptPasswordEncoder(4).encode("123"));
//	}
}
