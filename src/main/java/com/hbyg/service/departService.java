package com.hbyg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbyg.dao.DepartInfoMapper;
import com.hbyg.pojo.DepartInfo;
@Service
public class departService {
	@Autowired
	DepartInfoMapper depdao;

	public List<DepartInfo> getAllDep() {
		
		// TODO Auto-generated method stub
		return depdao.getAll();
	}
	
	
}
