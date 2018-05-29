package com.reaps.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reaps.system.dao.SysUserMapper;
import com.reaps.system.model.SysUserEntity;
import com.reaps.system.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public List<SysUserEntity> findAll() {
		return sysUserMapper.selectAll();
	}

}
