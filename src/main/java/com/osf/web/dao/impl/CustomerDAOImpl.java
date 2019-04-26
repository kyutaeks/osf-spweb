package com.osf.web.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.CustomerDAO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SqlSession ss;

	@Override
	public List<Map<String, String>> selectCustomerList() {
		Map<String, String> param = new HashMap<String, String>();
		param.put("ciNum", "1");
		param.put("ciID", "asd123");
		return ss.selectList("cust.selectCustomerList", param);
	}

	@Override
	public Map<String, String> selectCustomer(Integer ciNum) {
		return null;
	}

	@Override
	public int insertCustomer(Map<String, String> ci) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomer(Integer ciNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCustomer(Map<String, String> ci) {
		// TODO Auto-generated method stub
		return 0;
	}

}
