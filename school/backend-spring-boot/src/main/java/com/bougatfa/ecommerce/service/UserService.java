package com.bougatfa.ecommerce.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.bougatfa.ecommerce.model.User;
import com.bougatfa.ecommerce.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}