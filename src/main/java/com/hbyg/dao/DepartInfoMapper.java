package com.hbyg.dao;

import com.hbyg.pojo.DepartInfo;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DepartInfoMapper {
	void insertBatch(@Param("teachers")List<DepartInfo> list);
	
	List<DepartInfo> getAll();
	
    int deleteByPrimaryKey(Integer depId);

    int insert(DepartInfo record);

    DepartInfo selectByPrimaryKey(Integer depId);

    List<DepartInfo> selectAll();

    int updateByPrimaryKey(DepartInfo record);
}