package com.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Note:- This class is replacement of BeanConfigrationFile which is REQUIRED to create dispatcher-servlet

@EnableWebMvc
@Configuration
@ComponentScan("com.springmvc.controllers")
public class MyBeansConfig {

	
	@Bean
	public InternalResourceViewResolver resolver()
	{
		//ViewResolver Configuration
		
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/Views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
