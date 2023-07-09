package com.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*Note:- Because we extended AbstractAnnotationConfigDispatcherServletInitializer
         Dispatcher servlet will be created Automatically, we are only providing the resources
         that is requred to create Dispatcher-Servlet*/

// This class is replacement of WEB.XML file
public class MyWebConfig  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {MyBeansConfig.class};
		//Passing Beans Configuration which is REQUIRED to create Dispatcher Servlet
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Dispatcher Servlet - Mapping is being called..");
		return new String[] {"/"};
		
		//Mapping request for Dispatcher-Servlet.
	}
}
