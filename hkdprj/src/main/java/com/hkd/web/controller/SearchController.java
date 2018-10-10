package com.hkd.web.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hkd.web.dao.PlayerDao;
import com.hkd.web.entity.Player;

@Controller
@RequestMapping("/search/")
public class SearchController {
	
	@Autowired
	private PlayerDao playerDao;
	
	@GetMapping("list")
	public String list() {
		return "search.list";
	}
	
	@GetMapping("players")
	public String players(Model model) {
		
		Player player = playerDao.get("박주영");
		
		model.addAttribute("player", player);
		
		return "search.players";
	}
	
	@GetMapping("clubs")
	public String clubs() {
		return "search.clubs";
	}
}
