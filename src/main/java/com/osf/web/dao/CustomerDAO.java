package com.osf.web.dao;

import java.util.List;
import java.util.Map;

public interface CustomerDAO {

	public List<Map<String, String>> selectCustomerList();

	public Map<String, String> selectCustomer();

	public int insertCustomer();

	public int deleteCustomer();

	public int updateCustomer();
}
