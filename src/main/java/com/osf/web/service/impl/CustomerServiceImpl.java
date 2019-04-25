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
	public Map<String, String> selectCustomer() {
		return cdao.selectCustomer();
	}

	@Override
	public int insertCustomer() {
		return cdao.insertCustomer();
	}

	@Override
	public int deleteCustomer() {
		return cdao.deleteCustomer();
	}

	@Override
	public int updateCustomer() {
		return cdao.updateCustomer();
	}

}
