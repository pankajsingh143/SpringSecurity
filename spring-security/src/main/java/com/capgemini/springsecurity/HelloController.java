package com.capgemini.springsecurity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value = "/hello")
	public ResponseEntity<String> getMessage(){
		return new ResponseEntity<String>("Hello User", HttpStatus.OK);
	}

}
