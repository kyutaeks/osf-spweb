package com.osf.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.osf.web.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService cs;

	@RequestMapping(value = "/cust/list", method = RequestMethod.GET)
	public String goCustList(Model m) {
		m.addAttribute("custList", cs.selectCustomerList());
		return "/cust/list";
	}
}
