package com.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
	public class FeignClientConfiguration {
	    @Bean
	    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
	         return new BasicAuthRequestInterceptor("username", "password");
	    }
	}

