package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface{
	
	//Declaring and Initializing
	private DataAccessInterface<OrderModel> service;

	/**
	 * Setter for Service DataAccessInterface<OrderModel>
	 * @param service Specified for Service
	 */
    @Autowired
    public void setService(DataAccessInterface<OrderModel> service) {
        this.service = service;
    }
    
	/**
     * A test method to print a message.
     */
    @Override
    public void test() {
        System.out.println("Hello from the OrdersBusinessService");
    }

    /**
     * Retrieves a list of orders.
     * 
     * @return A list of {@link OrderModel} objects representing orders.
     */
    @Override
    public List<OrderModel> getOrders() {
        // Hard-coded list of orders
        return service.findAll();
    }
    
    /**
     * Initialization method.
     * This method is invoked by the container after instantiation but before dependency injection.
     */
    @Override
    public void init() {
        System.out.println("Hello from the OrdersBusinessService from the init() method");
    }
    
    /**
     * Destruction method.
     * This method is invoked by the container before the bean is destroyed.
     */
    @Override
    public void destroy() {
        System.out.println("Hello from the OrdersBusinessService from the destroy() method");
    }
    
}
