package com.reaps.system.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.reaps.system.model.SysUserEntity;
import com.reaps.system.mybatis.dao.BaseDao;

public interface SysUserMapper extends BaseDao<SysUserEntity>{

	SysUserEntity queryByUserName(String username);

	List<SysUserEntity> queryPage(@Param(value="userName")String userName);
	
}
