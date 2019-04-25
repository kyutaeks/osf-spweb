package com.osf.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

public class URIController {

	@RequestMapping("/uri/**")
	public String goPage(HttpServletRequest req) {
		return req.getRequestURI();
	}
}
