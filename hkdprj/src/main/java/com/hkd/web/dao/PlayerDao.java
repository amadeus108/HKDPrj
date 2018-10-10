package com.hkd.web.dao;

import java.util.List;

import com.hkd.web.entity.Player;

public interface PlayerDao {
	
	int insert(Player player);

	int update(Player player);

	int delete(String name);

	Player get(String name);

}
