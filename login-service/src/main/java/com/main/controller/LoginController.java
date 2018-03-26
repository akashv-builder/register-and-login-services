package com.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.feign.UserInformationProxy;
import com.main.modal.UserInformation;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LoginController {

	@Autowired
	UserInformationProxy userProxy;
	
	@PostMapping("/login")
	@HystrixCommand(fallbackMethod = "ifgetUserInformationFails")
	public String getUserInformation(@RequestBody UserInformation loginInfoInBody) {
		String message = "";
		String getPassword = "";
		UserInformation info = null;
		Optional<UserInformation> retrieverIformation = userProxy.getUserInformation(loginInfoInBody.getUserId());
			
		if (!retrieverIformation.isPresent()) {
			message = "No Such User Exists";
		} else {
			info = retrieverIformation.get();
			getPassword = info.getPassword();
			if (getPassword.equals(loginInfoInBody.getPassword())) {
				message = "Welcome" + info.getUserName();

			} else {
				message = "Incorrect Username Or password";
			}
		}

		return message;
	}
	public Optional<UserInformation> ifgetUserInformationFails() {
		UserInformation user= new UserInformation("default", "default", "default",null, "default","default", 0);
		return Optional.of(user);
	}
}
