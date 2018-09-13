package com.cice.security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfiguracion implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registro) {
		registro.addViewController("/home").setViewName("home");
		registro.addViewController("/").setViewName("home");
		registro.addViewController("/login").setViewName("login");
		registro.addViewController("/hello").setViewName("hello");
	
		
		
		
		
	}
	
	
}
