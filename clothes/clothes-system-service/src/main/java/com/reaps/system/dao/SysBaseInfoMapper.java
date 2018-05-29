package com.reaps.system.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.reaps.system.model.SysBaseInfoEntity;
import com.reaps.system.mybatis.dao.BaseDao;

public interface SysBaseInfoMapper extends BaseDao<SysBaseInfoEntity>{
	
	Page<SysBaseInfoEntity> queryPageByBaseInfo(@Param(value="baseInfo") SysBaseInfoEntity baseInfo);

	List<SysBaseInfoEntity> queryByParentId(@Param(value="baseinfoId") String baseinfoId);
	
	Integer queryMaxType();

	List<SysBaseInfoEntity> queryChildrenNodesByType(@Param(value="type") String type);
	
	void returnIdInsert(SysBaseInfoEntity baseinfo);

	List<SysBaseInfoEntity> queryIndustry(@Param(value="key") String key);

}
