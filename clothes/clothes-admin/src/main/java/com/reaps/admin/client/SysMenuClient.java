package com.reaps.admin.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.reaps.admin.util.Result;

@FeignClient(name = "clothes-system-service")
public interface SysMenuClient {

	@RequestMapping(value = "/getUserMenuList" , method=RequestMethod.POST)
	Result getUserMenuList(@RequestParam("userId") String userId);

}
