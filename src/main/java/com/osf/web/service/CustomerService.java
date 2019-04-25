package com.osf.web.service;

import java.util.List;
import java.util.Map;


public interface CustomerService {

	 List<Map<String, String>> selectCustomerList();

	 Map<String, String> selectCustomer();

	 int insertCustomer();

	 int deleteCustomer();

	 int updateCustomer();
}
