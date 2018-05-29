package com.reaps.system.dao;

import java.util.Map;
import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.reaps.system.model.SysCompanyEntity;
import com.reaps.system.mybatis.dao.BaseDao;

public interface SysCompanyMapper extends BaseDao<SysCompanyEntity>{
	
	/**
	 * 分页查询
	 */
	Page<SysCompanyEntity> queryPageByCompany(@Param(value="company") SysCompanyEntity company);

	/**
	 * 批量修改数据删除状态
	 * @param map
	 */
	void updateDeleteFlagByIds(Map<String, Object> map);
}
