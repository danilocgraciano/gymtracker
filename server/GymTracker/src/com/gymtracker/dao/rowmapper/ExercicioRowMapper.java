package com.gymtracker.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gymtracker.constants.ExercicioConstants;
import com.gymtracker.entity.Exercicio;

public class ExercicioRowMapper implements RowMapper<Exercicio> {

	@Override
	public Exercicio mapRow(ResultSet rs, int i) throws SQLException {
		Exercicio e = new Exercicio();
		e.setId(rs.getString(ExercicioConstants.ID));
		e.setNome(rs.getString(ExercicioConstants.NOME));
		return e;
	}

}
