package com.gymtracker.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.gymtracker.dao.ExercicioDAO;
import com.gymtracker.entity.Exercicio;
import com.gymtracker.service.ExercicioService;

@Component
public class ExercicioServiceImpl implements ExercicioService {

	private ExercicioDAO dao;

	@Override
	public Exercicio save(Exercicio e) throws Exception {
		return dao.save(e);
	}

	@Override
	public void update(Exercicio e) throws Exception {
		dao.update(e);
	}

	@Override
	public void delete(String id) throws Exception {
		dao.delete(id);
	}

	@Override
	public Exercicio findById(String id) throws Exception {
		return dao.findById(id);
	}

	@Override
	public List<Exercicio> findAll(Integer limit, Integer offset) throws Exception {
		return dao.findAll(limit, offset);
	}

	@Override
	public void validate(Exercicio e) throws Exception {

		if (e.getNome() == null || e.getNome().trim().isEmpty())
			throw new Exception("Nome é um dado obrigatório!");

	}

}
