package com.reaps.system.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.reaps.system.model.SysDepartmentEntity;
import com.reaps.system.mybatis.dao.BaseDao;

public interface SysDepartmentMapper extends BaseDao<SysDepartmentEntity> {
	
	/**分页/查询分页*/
	List<SysDepartmentEntity> queryPage(@Param(value="departmentName") String departmentName);

	/** 根据公司ID获取部门*/
	List<SysDepartmentEntity> findByCompanyId(String companyId);

	/** 获得上级部门tree数据*/
	List<SysDepartmentEntity> findTreeList();
	
	/** 根据uid(departmentId)查询部门对象（包含上级部门名称,添加了parentName属性）*/
	SysDepartmentEntity findParentById(@Param("uid")String uid);

}
