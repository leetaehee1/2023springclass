package com.sg.leo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.sg.leo.domain.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("/blog")
	public User httpGet() {
		User finduser = User.builder().id(1).username("ai").password("ai11").email("ai@g.com").build();
		return finduser;
	}
}
