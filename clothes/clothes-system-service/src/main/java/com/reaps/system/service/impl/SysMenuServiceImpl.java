package com.reaps.system.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.reaps.system.dao.SysMenuMapper;
import com.reaps.system.dao.SysRoleMapper;
import com.reaps.system.dao.SysUserMapper;
import com.reaps.system.model.SysMenuEntity;
import com.reaps.system.model.SysRoleEntity;
import com.reaps.system.model.SysUserEntity;
import com.reaps.system.service.SysMenuService;

@Service
public class SysMenuServiceImpl implements SysMenuService {
	
	@Autowired
	private SysMenuMapper sysMenuMapper;
	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Override
	public List<SysMenuEntity> getUserMenuList(String userId) {
		SysUserEntity user = sysUserMapper.select(userId);
		List<String> roleIds = Arrays.asList(user.getRoleIds().split(","));
		// 获取用户角色
		List<SysRoleEntity> roles = sysRoleMapper.selectByIds(roleIds);
		// 有权限的菜单
		List<String> menuIds = new ArrayList<>();
		if(!CollectionUtils.isEmpty(roles)) {
			for(int i=0 ; i<roles.size() ; i++) {
				SysRoleEntity role = roles.get(i);
				if(!StringUtils.isEmpty(role.getPerms())) {
					List<String> mIds = Arrays.asList(role.getPerms().split(","));
					menuIds.addAll(mIds);
				}
			}
		}
		List<SysMenuEntity> menuList = sysMenuMapper.selectByIds(menuIds);
		
		return menuList;
	}
	
	public List<SysMenuEntity> getUserMenuTree(List<SysMenuEntity> menus){
		List<SysMenuEntity> pMenuList = new ArrayList<>();
		for(int i=0 ; i<menus.size() ; i++) {
			SysMenuEntity menu = menus.get(i);
			if("0".equals(menu.getParentId())) {
				pMenuList.add(menu);
			}
		}
		// 支持二级菜单
		for(int i=0 ; i<pMenuList.size() ; i++) {
			SysMenuEntity pMenu = pMenuList.get(i);
			
			List<SysMenuEntity> childMenus = new ArrayList<>();
			for(int k=0 ; k<menus.size() ; k++) {
				SysMenuEntity cMenu = menus.get(k);
				if(cMenu.getParentId().equals(pMenu.getUid())) {
					childMenus.add(cMenu);
				}
			}
			pMenu.setMenuList(childMenus);
		}
		
		return pMenuList;
	}

	@Override
	public Page<SysMenuEntity> queryList(Map<String, Object> hashMap, Integer page, Integer limit) {
		PageHelper.startPage(page, limit);  
        Page<SysMenuEntity> pageList = (Page<SysMenuEntity>) sysMenuMapper.queryList(hashMap);
        return pageList;
	}

	@Override
	public List<SysMenuEntity> queryNotButtonList() {
		return sysMenuMapper.queryNotButtonList();
	}

	@Override
	public SysMenuEntity select(String parentId) {
		return sysMenuMapper.queryByUid(parentId);
	}

	@Transactional(readOnly=false)
	@Override
	public void save(SysMenuEntity menu) {
		sysMenuMapper.insert(menu);		
	}

	@Transactional(readOnly=false)
	@Override
	public void update(SysMenuEntity menu) {
		sysMenuMapper.update(menu);
	}

	@Transactional(readOnly=false)
	@Override
	public void deleteBatch(String[] menuIds) {
		sysMenuMapper.deleteByIds(Arrays.asList(menuIds));
	}

}
