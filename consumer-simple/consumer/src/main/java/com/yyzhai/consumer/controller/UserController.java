package com.yyzhai.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yyzhai.consumer.service.IUserRemoteService;

@RestController
public class UserController {

	@Autowired
	IUserRemoteService userService;

	@RequestMapping("/user/{name}")
	public String get(@PathVariable("name") String name) {
		return userService.get(name);
	}
}
