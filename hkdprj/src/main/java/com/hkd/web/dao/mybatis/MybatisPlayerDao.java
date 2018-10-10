package com.hkd.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hkd.web.dao.PlayerDao;
import com.hkd.web.entity.Player;

@Repository
public class MybatisPlayerDao implements PlayerDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(Player player) {
		PlayerDao playerDao = sqlSession.getMapper(PlayerDao.class);
		
		return playerDao.insert(player);
	}

	@Override
	public int update(Player player) {
		PlayerDao playerDao = sqlSession.getMapper(PlayerDao.class);
		
		return playerDao.update(player);
	}

	@Override
	public int delete(String name) {
		PlayerDao playerDao = sqlSession.getMapper(PlayerDao.class);
		
		return playerDao.delete(name);
	}

	@Override
	public Player get(String name) {

		PlayerDao playerDao = sqlSession.getMapper(PlayerDao.class);
		
		return playerDao.get(name);
	
	}

}
