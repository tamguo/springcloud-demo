package com.reaps.system.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reaps.system.model.SysUserEntity;
import com.reaps.system.service.UserService;

@RestController
public class HelloWorldController {
	
	@Autowired
	UserService userService;

	@GetMapping("hello")
	public String helloWorld() {
		return "hello world";
	}
	
	@GetMapping("findAll")
	public @ResponseBody List<SysUserEntity> findAll(){
		return userService.findAll();
	}
}
