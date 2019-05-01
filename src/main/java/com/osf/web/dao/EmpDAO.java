package com.osf.web.dao;

import java.util.Map;

public interface EmpDAO {
	Map<String,String> selectEmpById(Map<String,String> emp);
}
