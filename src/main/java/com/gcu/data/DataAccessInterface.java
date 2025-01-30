package com.gcu.data;

import java.util.List;

public interface DataAccessInterface <T>{
	
	/**
	 * Method to find all orders in SQL Database
	 * @return List<T>
	 */
	public List<T> findAll();
	
	/**
	 * Method to find each order by their unique ID
	 * @param id Specified ID
	 * @return T
	 */
	public T findById(int id);
	
	/**
	 * Method to create an entity
	 * @param t Specified for T
	 * @return true or false
	 */
	public boolean create(T t);
	
	/**
	 * Method to update and entity
	 * @param t Specified for T
	 * @return true or false
	 */
	public boolean update(T t);
	
	/**
	 * Method to delete an entity
	 * @param t Specified for T
	 * @return true or false
	 */
	public boolean delete(T t);
}
