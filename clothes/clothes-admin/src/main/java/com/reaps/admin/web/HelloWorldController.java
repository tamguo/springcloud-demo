package com.reaps.admin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reaps.admin.client.ClothesSystemClient;
import com.reaps.admin.client.SysMenuClient;
import com.reaps.admin.util.Result;

@RestController
public class HelloWorldController {
	
	@Autowired
	ClothesSystemClient clothesSystemClient;
	@Autowired
	SysMenuClient sysMenuClient;

	@GetMapping(path="helloWorld")
	public String helloWorld() {
		return clothesSystemClient.helloWorld();
	}
	
	@GetMapping(path="findAll")
	public String findAll() {
		return clothesSystemClient.findAll();
	}
	
	@GetMapping(path="getUserMenuList")
	public Result getUserMenuList(String userId) {
		return sysMenuClient.getUserMenuList(userId);
	}
	
}
