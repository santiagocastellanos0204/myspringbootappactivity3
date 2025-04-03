package com.gcu.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService {

    // Create a logger instance
    private static final Logger logger = LoggerFactory.getLogger(SecurityBusinessService.class);

    /**
     * Authenticates a user.
     * 
     * @param username The username of the user.
     * @param password The password of the user.
     * @return true if authentication is successful, false otherwise.
     */
    public boolean authenticate(String username, String password) {
        logger.info("Authenticating user: {}", username); // Log the username
        logger.debug("Password received (not recommended to log passwords)");

        // Perform authentication logic (this example always returns true)
        boolean isAuthenticated = true;

        if (isAuthenticated) {
            logger.info("User {} authenticated successfully", username);
        } else {
            logger.warn("Authentication failed for user {}", username);
        }

        return isAuthenticated;
    }
}
