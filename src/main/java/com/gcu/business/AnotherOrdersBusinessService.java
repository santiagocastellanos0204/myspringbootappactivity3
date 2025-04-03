package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessInterface {

    private static final Logger logger = LoggerFactory.getLogger(AnotherOrdersBusinessService.class);

    /**
     * A test method to print a message.
     */
    @Override
    public void test() {
        logger.info("Executing test method in AnotherOrdersBusinessService.");
        System.out.println("Hello from the AnotherOrdersBusinessService");
    }

    /**
     * Retrieves a list of orders.
     * 
     * @return A list of {@link OrderModel} objects representing orders.
     */
    @Override
    public List<OrderModel> getOrders() {
        logger.info("Fetching list of hardcoded orders...");
        
        List<OrderModel> orders = new ArrayList<>();
        try {
            orders.add(new OrderModel(5L, "0000000006", "Product 6", 6.00f, 6));
            orders.add(new OrderModel(6L, "0000000007", "Product 7", 7.00f, 7));
            orders.add(new OrderModel(7L, "0000000008", "Product 8", 8.00f, 8));
            orders.add(new OrderModel(8L, "0000000009", "Product 9", 9.00f, 9));
            orders.add(new OrderModel(9L, "0000000010", "Product 10", 10.00f, 10));

            logger.debug("Retrieved {} hardcoded orders.", orders.size());
        } catch (Exception e) {
            logger.error("Error while generating hardcoded orders: {}", e.getMessage(), e);
        }
        return orders;
    }

    /**
     * Initialization method.
     * This method is invoked by the container after instantiation but before dependency injection.
     */
    @Override
    public void init() {
        logger.info("AnotherOrdersBusinessService initialized.");
        System.out.println("Hello from the AnotherOrdersBusinessService from the init() method");
    }

    /**
     * Destruction method.
     * This method is invoked by the container before the bean is destroyed.
     */
    @Override
    public void destroy() {
        logger.info("AnotherOrdersBusinessService is being destroyed.");
        System.out.println("Hello from the AnotherOrdersBusinessService from the destroy() method");
    }
}
