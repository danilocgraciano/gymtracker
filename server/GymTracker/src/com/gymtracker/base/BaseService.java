package com.gymtracker.base;

import java.util.List;

public interface BaseService<E extends BaseEntity> {

	public E save(E e) throws Exception;

	public void update(E e) throws Exception;

	public void delete(String id) throws Exception;

	public E findById(String id) throws Exception;

	public List<E> findAll(Integer limit, Integer offset) throws Exception;

	public void validate(E e) throws Exception;

}
