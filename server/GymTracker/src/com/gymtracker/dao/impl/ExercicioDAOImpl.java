package com.gymtracker.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gymtracker.base.BaseDAO;
import com.gymtracker.entity.Exercicio;

@Repository
public class ExercicioDAOImpl implements BaseDAO<Exercicio>{

	@Override
	public Exercicio save(Exercicio e) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Exercicio e) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Exercicio findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exercicio> find(String sql) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exercicio> findAll(Integer limit, Integer offset) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
