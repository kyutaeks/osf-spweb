package com.osf.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.osf.web.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CustomerController {

	@Autowired
	private CustomerService cs;

	@RequestMapping("/customer/list")
	public String customerList(Model m) {
		m.addAttribute("list", cs.selectCustomerList());
		return "/uri/customer/list";
	}

	@RequestMapping(value = "/customer/insert", method = RequestMethod.POST)
	public String joinCustomer(Model m, @RequestParam Map ci) {
		log.debug("param=>{}", ci);
		m.addAttribute("insertInfo", cs.insertCustomer(ci));
		return "/uri/customer/insert";
	}
}