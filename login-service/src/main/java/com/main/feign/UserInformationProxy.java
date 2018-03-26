package com.main.feign;

import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.main.modal.UserInformation;

//@FeignClient(value="topic-service",url="localhost:8000")
//@FeignClient(value="registration-service",fallback= FallBackClass.class)
//@FeignClient(value="api-gateway-zull",fallback= FallBackClass.class,configuration = FeignClientConfiguration.class)
@FeignClient(value="api-gateway-zull",fallback= FallBackClass.class)
@RibbonClient(name="registration-service")
public interface UserInformationProxy {

	@GetMapping("registration-service/register/{id}")
	public Optional<UserInformation> getUserInformation(@PathVariable(value = "id") String id);
}
