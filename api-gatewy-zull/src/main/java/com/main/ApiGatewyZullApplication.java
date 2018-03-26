package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewyZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewyZullApplication.class, args);
	}
	/*@Bean
	public AuthenticatedFilter getAuthenticatedFilter () {
	    return new AuthenticatedFilter();
	}
	@Bean
	public UppercaseRequestEntityFilter modifyRequestEntityFilter() {
		return new UppercaseRequestEntityFilter();
	}*/
}
