package com.hkd.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search/")
public class SearchController {
	
	@GetMapping("players")
	public String players() {
		return "search.players";
	}
	
	@GetMapping("clubs")
	public String clubs() {
		return "search.clubs";
	}
}
