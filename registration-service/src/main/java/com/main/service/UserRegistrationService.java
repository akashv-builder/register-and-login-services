package com.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.exception.UserNotFountException;
import com.main.modal.UserInformation;
import com.main.repository.UserRepository;

@Service
public class UserRegistrationService {
	
	//need to be taken from db,increment it and again put it in db
	static int id=112;
	
	@Autowired
	UserRepository userRepository;

	public List<UserInformation> getAllRegisteredUserInformation() {
		List<UserInformation> allUsersFound = new ArrayList<>();
		userRepository.findAll().forEach(allUsersFound::add);
		return allUsersFound;
	}

	public Optional<UserInformation> getUserInformation(String id) {
		 Optional<UserInformation> userFound=userRepository.findById(id);
		 //if not found creating a custom exception and generating the http code 
		 //checking if object is null throw exception
		 if(!userFound.isPresent()) {
			 throw new UserNotFountException("id-"+id);
		 }
		 return userFound;
	}

	public void addUserInformation(UserInformation dataOfUserInBody) {
		if(dataOfUserInBody.getUserId()==null) {
			dataOfUserInBody.setUserId("KKD"+id++);
		}
		userRepository.save(dataOfUserInBody);

	}

	public void modifyUserInformation(UserInformation dataOfUserInBody) {
		userRepository.save(dataOfUserInBody);

	}

	public void deleteUserInformation(String id) {
		 Optional<UserInformation> userFound=userRepository.findById(id);
		 //if not found creating a custom exception and generating the http code		 
		 //checking if object is null throw exception
		 if(!userFound.isPresent()) {
			 throw new UserNotFountException("id-"+id);
		 }
		 userRepository.deleteById(id);
	}

}
