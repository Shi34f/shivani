
package com.user.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.user.model.UserDetails;
import com.user.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public UserDetails addDetails(UserDetails user) {
		return userRepository.save(user);	
		
	}

	public List<UserDetails> getAllDetails() {
		return userRepository.findAll();
	
	}
	
	
     public Optional<UserDetails> getDetailsById(int userId) {
		
		return userRepository.findById(userId);
	}
     
     
  
      
   
	
	public void deleteDetailsById(int userId) {
		
		userRepository.deleteById(userId);
	}
	
	public UserDetails updateDetail(UserDetails user) {
		return userRepository.save(user);
	}
	

	
	

}



