package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@GetMapping(value="/getall")
	ResponseEntity<?> getAll(){
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}
	
}
