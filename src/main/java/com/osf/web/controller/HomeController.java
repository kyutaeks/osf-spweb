package com.osf.web.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	@Autowired
	private DataSource ds;

	@RequestMapping("/")
	public String goHome() {
		return "index";
	}

	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String goTest(Model model) {
		try {
			log.info("con=>{}", ds.getConnection());
		} catch (SQLException e) {
			
		}
		model.addAttribute("msg", "hello~");
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		model.addAttribute("list", list);
		return "test";
	}
}
