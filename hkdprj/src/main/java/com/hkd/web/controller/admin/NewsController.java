package com.hkd.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/news/")
public class NewsController {
	
	@RequestMapping("list")
	public String list() {
		return "admin.news.list";
	}
	
	@RequestMapping("insert")
	public String insert() {
		return "admin.news.insert";
	}
	
}
