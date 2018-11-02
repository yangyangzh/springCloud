package com.yyzhai.producer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/user/{name}")
	public String get(@PathVariable("name") String name) {
		return "hello " + name + ",this is first messge";
	}
}
