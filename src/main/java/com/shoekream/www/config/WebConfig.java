package com.shoekream.www.config;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfigure.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		encodingFilter.setForceEncoding(true);
		return new Filter[] {encodingFilter};
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");

		String uploadLocation = null;
		int maxFileSize = 30 * 1024 * 1024; // 30MB
		int maxReqSize = maxFileSize * 3; // 파일 전송
		int fileSizeThreshold = maxFileSize; // 메모리에서 파일을 전송할 때 만들어지는 임시저장공간의 크기

		MultipartConfigElement configElement = new MultipartConfigElement(uploadLocation, maxFileSize, maxReqSize, fileSizeThreshold);
		registration.setMultipartConfig(configElement);
	}
	
}
