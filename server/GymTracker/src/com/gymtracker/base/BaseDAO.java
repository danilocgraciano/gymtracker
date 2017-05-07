package com.gymtracker.base;

import java.util.List;

public interface BaseDAO<E extends BaseEntity> {

	public E save(E e);

	public void update(E e);

	public void delete(String id);

	public E findById(String id);

	public List<E> findAll(Integer limit, Integer offset);

}
