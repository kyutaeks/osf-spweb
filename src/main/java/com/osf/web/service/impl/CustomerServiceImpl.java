package com.osf.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osf.web.dao.CustomerDAO;
import com.osf.web.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO cdao;

	@Override
	public List<Map<String, String>> selectCustomerList() {
		return cdao.selectCustomerList();
	}

	@Override
	public Map<String, String> selectCustomer(Integer ciNum) {
		return cdao.selectCustomer(ciNum);
	}

	@Override
	public int insertCustomer(Map<String, String> ci) {
		return cdao.insertCustomer(ci);
	}

	@Override
	public int deleteCustomer(Integer ciNum) {
		return cdao.deleteCustomer(ciNum);
	}

	@Override
	public int updateCustomer(Map<String, String> ci) {
		return cdao.updateCustomer(ci);
	}

}
