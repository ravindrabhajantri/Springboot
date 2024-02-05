package com.hdfc.rcp.logger.service;

import com.hdfc.rcp.logger.base.RCPLogger;
import com.hdfc.rcp.logger.request.TransactionalLogRequest;

public class TransactionalLogger extends RCPLogger{
    TransactionalLogRequest request;

    public void log(TransactionalLogRequest request) {
        System.out.println("TransactionalLogService");
        maskingService.mask();
        publisherService.publish();
    }
}
