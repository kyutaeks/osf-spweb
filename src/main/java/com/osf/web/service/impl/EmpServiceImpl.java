package com.osf.web.service.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osf.web.dao.DeptDAO;
import com.osf.web.dao.EmpDAO;
import com.osf.web.service.EmpService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDAO edao;

	@Autowired
	private DeptDAO ddao;

	@Override
	public boolean loginEmp(Map<String, String> emp, HttpSession hs) {
		Map<String, String> dbEmp = edao.selectEmpById(emp);
		emp.put("lvl", "1");
		log.info("empList=>{}", edao.selectEmpList2(emp));
		if (dbEmp == null || !dbEmp.get("PWD").equals(emp.get("pwd"))) {
			return false;
		}
		if ("2".equals(dbEmp.get("LVL"))) {
			emp.put("lvl", "1");
			hs.setAttribute("empList", edao.selectEmpList2(emp));
		}
		hs.setAttribute("emp", dbEmp);
		return true;
	}

	@Override
	public List<Map<String, String>> selectDeptList() {
		return ddao.selectDeptList();
	}

}
