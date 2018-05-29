package com.reaps.system.dao;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.reaps.system.model.SysMenuEntity;
import com.reaps.system.mybatis.dao.BaseDao;

public interface SysMenuMapper extends BaseDao<SysMenuEntity>{

	Page<SysMenuEntity> queryList(Map<String, Object> hashMap);

	List<SysMenuEntity> queryNotButtonList();

	SysMenuEntity queryByParentId(String parentId);

	SysMenuEntity queryByUid(String uid);

}
