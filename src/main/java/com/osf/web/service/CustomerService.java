package com.osf.web.service;

import java.util.List;
import java.util.Map;

public interface CustomerService {

	List<Map<String, String>> selectCustomerList();

	Map<String, String> selectCustomer(Integer ciNum);

	int insertCustomer(Map<String, String> ci);

	int deleteCustomer(Integer ciNum);

	int updateCustomer(Map<String, String> ci);
}
