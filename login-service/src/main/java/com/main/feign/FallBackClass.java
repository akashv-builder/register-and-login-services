package com.main.feign;


import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.main.modal.UserInformation;


@Component
public class FallBackClass implements UserInformationProxy {


	@Override
	public Optional<UserInformation> getUserInformation(@PathVariable(value = "id") String id) {
		UserInformation user= new UserInformation("default", "default", "default",null, "default","default", 0);
		return Optional.of(user);
	}

}
