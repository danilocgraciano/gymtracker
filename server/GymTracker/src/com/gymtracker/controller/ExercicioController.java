package com.gymtracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gymtracker.entity.Exercicio;
import com.gymtracker.service.ExercicioService;

@RestController
@SuppressWarnings({ "rawtypes", "unchecked" })
public class ExercicioController {

	@Autowired
	private ExercicioService service;

	@GetMapping("exercicios")
	public ResponseEntity getExercicios(Integer limit, Integer offset) {
		List<Exercicio> list = null;
		try {
			list = service.findAll(limit, offset);
			return new ResponseEntity(list, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("exercicio/{id}")
	public ResponseEntity getExercicio(@PathVariable("id") String id) {
		Exercicio exercicio = null;
		try {
			exercicio = service.findById(id);
			if (exercicio == null)
				return new ResponseEntity("Nenhum exercício encontrado para o ID " + id, HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity(exercicio, HttpStatus.OK);
	}

	@PostMapping("exercicio")
	public ResponseEntity createExercicio(@RequestBody Exercicio exercicio) {

		try {
			exercicio = service.save(exercicio);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(exercicio, HttpStatus.OK);

	}

	@DeleteMapping("exercicio/{id}")
	public ResponseEntity deleteExercicio(@PathVariable("id") String id) {
		try {
			service.delete(id);
			return new ResponseEntity(id, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("exercicio")
	public ResponseEntity updateExercicio(@RequestBody Exercicio exercicio) {

		try {
			service.update(exercicio);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(exercicio, HttpStatus.OK);

	}

}
