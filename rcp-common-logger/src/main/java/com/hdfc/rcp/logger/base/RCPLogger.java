package com.hdfc.rcp.logger.base;

import com.hdfc.rcp.logger.utils.MaskingService;
import com.hdfc.rcp.logger.utils.PublisherService;

public class RCPLogger {
     /** Initialization required by Transactional, Interface and DOTF logs
      * For example the environment variables, utility services like Masking encryption etc can be done here
      */
     protected MaskingService maskingService = new MaskingService();
     protected PublisherService publisherService = new PublisherService();

    /**
     * no common log method as they take different arguments (request objects are different for types of logs)
     * If I had to create log (RCPLogRequest) then they are of different composition.
     * Substitution (sub class to parent call may not get all the required getter methods
     *
     */
}
