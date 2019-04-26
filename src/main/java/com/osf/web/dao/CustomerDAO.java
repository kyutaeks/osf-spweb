package com.osf.web.dao;

import java.util.List;
import java.util.Map;

public interface CustomerDAO {

	List<Map<String, String>> selectCustomerList();

	Map<String, String> selectCustomer(Integer ciNum);

	int insertCustomer(Map<String, String> ci);

	int deleteCustomer(Integer ciNum);

	int updateCustomer(Map<String, String> ci);
}
