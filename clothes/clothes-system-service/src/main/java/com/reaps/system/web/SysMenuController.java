package com.reaps.system.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reaps.system.service.SysMenuService;
import com.reaps.system.util.Result;

@RestController
public class SysMenuController {
	
	@Autowired
	private SysMenuService sysMenuService;

	@PostMapping(path="getUserMenuList")
	@ResponseBody
	Result getUserMenuList(){
		return Result.successResult(sysMenuService.getUserMenuList("1"));
	}
	
}
