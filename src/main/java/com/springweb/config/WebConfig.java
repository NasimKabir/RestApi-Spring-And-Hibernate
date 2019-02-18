package com.springweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/js/**").addResourceLocations("/ui/js/");
		registry.addResourceHandler("/css/**").addResourceLocations("/ui/css/");
		registry.addResourceHandler("/*.jsp/**").addResourceLocations("/WEB-INF/views/");
	}
}
