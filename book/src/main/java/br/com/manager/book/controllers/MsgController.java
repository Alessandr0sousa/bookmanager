package br.com.manager.book.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MsgController { 
	@GetMapping
	public ResponseEntity<String> msg() {
		String msg = "Oi, eu sou Goku!";
		return ResponseEntity.ok(msg);
	}
}
