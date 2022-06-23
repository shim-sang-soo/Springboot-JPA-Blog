package com.cos.blog;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {
	
	// http://localhost:9000/http/get
	@GetMapping("/http/get")
	public String getTest() {
		return "get 요청";
	}

	@PostMapping("/http/post")
	public String poetTest() {
		return "post 요청";
	}

	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}

	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	
	
	
}
