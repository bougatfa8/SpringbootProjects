package com.example.login;

import javax.annotation.PostConstruct;

import com.example.login.models.Role;
import com.example.login.models.User;
import com.example.login.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LoginApplication {
    
	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

	/*@PostConstruct
	void init_users() {
		//ajouter les rôles
		userService.addRole(new Role(null,"ADMIN"));
		userService.addRole(new Role(null,"USER"));
		//ajouter les users
		userService.saveUser(new User(null,"admin","123",true,null));
		userService.saveUser(new User(null,"raed","1234",true,null));
		userService.saveUser(new User(null,"foulen","12345",true,null));
		//ajouter les rôles aux users
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		userService.addRoleToUser("raed", "USER");
		userService.addRoleToUser("foulen", "USER");
	}*/

	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}

}
