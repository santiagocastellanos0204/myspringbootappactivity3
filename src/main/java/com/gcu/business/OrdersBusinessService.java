package com.gcu.business;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface {

    private static final Logger logger = LoggerFactory.getLogger(OrdersBusinessService.class);

    // Declaring and Initializing
    private DataAccessInterface<OrderModel> service;

    /**
     * Setter for Service DataAccessInterface<OrderModel>
     * @param service Specified for Service
     */
    @Autowired
    public void setService(DataAccessInterface<OrderModel> service) {
        this.service = service;
        logger.info("DataAccessInterface service has been set.");
    }

    /**
     * A test method to print a message.
     */
    @Override
    public void test() {
        logger.info("Executing test method in OrdersBusinessService.");
        System.out.println("Hello from the OrdersBusinessService");
    }

    /**
     * Retrieves a list of orders.
     * 
     * @return A list of {@link OrderModel} objects representing orders.
     */
    @Override
    public List<OrderModel> getOrders() {
        logger.info("Fetching list of orders...");
        try {
            List<OrderModel> orders = service.findAll();
            logger.debug("Retrieved {} orders from the database.", orders.size());
            return orders;
        } catch (Exception e) {
            logger.error("Error retrieving orders: {}", e.getMessage(), e);
            return List.of(); // Return an empty list on failure
        }
    }

    /**
     * Initialization method.
     * This method is invoked by the container after instantiation but before dependency injection.
     */
    @Override
    public void init() {
        logger.info("OrdersBusinessService initialized.");
        System.out.println("Hello from the OrdersBusinessService from the init() method");
    }

    /**
     * Destruction method.
     * This method is invoked by the container before the bean is destroyed.
     */
    @Override
    public void destroy() {
        logger.info("OrdersBusinessService is being destroyed.");
        System.out.println("Hello from the OrdersBusinessService from the destroy() method");
    }
}
