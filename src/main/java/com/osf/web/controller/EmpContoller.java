package com.osf.web.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.osf.web.service.EmpService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EmpContoller {
	@Autowired
	private EmpService es;

	@RequestMapping(value = "/emp/login", method = RequestMethod.POST)
	public String doLogin(@RequestParam Map<String, String> params, HttpSession hs) {
		log.info("parameter : {}", params);
		if (es.loginEmp(params, hs)) {
			return "/uri/loginOk";
		}
		return "redirect:/resources/login.html";
	}
}
