package com.hdfc.rcp.logger.service;

import com.hdfc.rcp.logger.base.RCPLogger;
import com.hdfc.rcp.logger.request.TransactionalLogRequest;
import com.hdfc.rcp.logger.utils.MaskingService;
import com.hdfc.rcp.logger.utils.PublisherService;

public class TransactionalLogService implements RCPLogger<TransactionalLogRequest> {
    MaskingService maskingService = new MaskingService();
    PublisherService publisherService = new PublisherService();

    public void log(TransactionalLogRequest request) {
        System.out.println("TransactionalLogService");
        maskingService.mask();
        publisherService.publish();
    }
}
