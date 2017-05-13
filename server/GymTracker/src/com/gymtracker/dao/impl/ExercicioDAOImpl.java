package com.gymtracker.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.gymtracker.constants.ExercicioConstants;
import com.gymtracker.dao.ExercicioDAO;
import com.gymtracker.dao.JDBCBaseDAO;
import com.gymtracker.dao.rowmapper.ExercicioRowMapper;
import com.gymtracker.entity.Exercicio;

@Repository
public class ExercicioDAOImpl extends JDBCBaseDAO implements ExercicioDAO {

	@Override
	public Exercicio save(Exercicio e) throws Exception {

		StringBuffer sql = new StringBuffer("INSERT INTO ");
		sql.append(ExercicioConstants.SCHEMA_TABELA);
		sql.append(" (");
		{
			sql.append(ExercicioConstants.NOME);
		}
		sql.append(" )");
		sql.append(" VALUES (?) RETURNING ");
		sql.append(ExercicioConstants.ID);
		Object args[] = { e.getNome() };

		e.setId(getJdbcTemplate().queryForObject(sql.toString(), args, String.class));
		return e;
	}

	@Override
	public void update(Exercicio e) throws Exception {
		StringBuffer sql = new StringBuffer("UPDATE ");
		sql.append(ExercicioConstants.SCHEMA_TABELA);
		sql.append(" SET ");
		{
			sql.append(ExercicioConstants.NOME).append(" = ?");
		}
		sql.append(" WHERE ").append(ExercicioConstants.ID).append(" = ?");
		Object args[] = { e.getNome(), e.getId() };
		getJdbcTemplate().update(sql.toString(), args);
	}

	@Override
	public void delete(String id) throws Exception {

		StringBuffer sql = new StringBuffer("DELETE FROM ");
		sql.append(ExercicioConstants.SCHEMA_TABELA);
		sql.append(" WHERE ").append(ExercicioConstants.ID).append(" = ?");

		Object args[] = { id };
		getJdbcTemplate().update(sql.toString(), args);
	}

	@Override
	public Exercicio findById(String id) throws Exception {
		StringBuffer sql = new StringBuffer("SELECT * FROM ");
		sql.append(ExercicioConstants.SCHEMA_TABELA);
		sql.append(" WHERE ").append(ExercicioConstants.ID).append(" = ?");

		Object args[] = { id };
		return (Exercicio) getJdbcTemplate().query(sql.toString(), args, new ExercicioRowMapper());
	}

	@Override
	public List<Exercicio> findAll(Integer limit, Integer offset) throws Exception {
		StringBuffer sql = new StringBuffer("SELECT * FROM ");
		sql.append(ExercicioConstants.SCHEMA_TABELA);

		Object args[] = { limit, offset };
		if (limit != null && offset != null) {
			sql.append(" LIMIT ? OFFSET ?");
		}
		return getJdbcTemplate().query(sql.toString(), args, new ExercicioRowMapper());

	}

	@Override
	public long count() throws Exception {
		StringBuffer sql = new StringBuffer("SELECT COUNT(");
		sql.append(ExercicioConstants.ID);
		sql.append(") FROM ").append(ExercicioConstants.SCHEMA_TABELA);
		return getJdbcTemplate().queryForObject(sql.toString(), Long.class);
	}

}
