package com.osf.web.service.impl;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osf.web.dao.EmpDAO;
import com.osf.web.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDAO edao;
	
	@Override
	public boolean loginEmp(Map<String, String> emp, HttpSession hs) {
		Map<String, String> dbEmp = edao.selectEmpById(emp);
		if (dbEmp == null || !dbEmp.get("PWD").equals(emp.get("pwd"))) {
			return false;
		}
		hs.setAttribute("emp", dbEmp);
		return true;
	}

}
