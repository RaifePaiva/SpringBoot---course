package com.educandoweb.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		// o L acompanhado do ID representa o LONG tipo de dado mda variavel
		User u = new User(1L, "Raífe Ferreira", "raife.paiva@gmail.com", "21980745821", "123");
		return ResponseEntity.ok().body(u);
	}
	
}
