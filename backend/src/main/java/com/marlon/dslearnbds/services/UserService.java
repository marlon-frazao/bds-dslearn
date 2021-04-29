package com.marlon.dslearnbds.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marlon.dslearnbds.dto.UserDTO;
import com.marlon.dslearnbds.entities.User;
import com.marlon.dslearnbds.repositories.UserRepository;
import com.marlon.dslearnbds.services.exceptions.ResourceNotFoundException;

@Service
public class UserService implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Entity not found")).convert();
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByEmail(username);

		if (user == null) {
			logger.error("User not found: " + username);
			throw new UsernameNotFoundException("Email not found!");
		}

		logger.info("User found: " + username);

		return user;
	}

}
