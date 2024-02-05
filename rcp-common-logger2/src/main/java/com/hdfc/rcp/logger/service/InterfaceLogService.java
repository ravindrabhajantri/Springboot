package com.hdfc.rcp.logger.service;

import com.hdfc.rcp.logger.base.RCPLogger;
import com.hdfc.rcp.logger.request.InterfaceLogRequest;
import com.hdfc.rcp.logger.utils.MaskingService;
import com.hdfc.rcp.logger.utils.PublisherService;

public class InterfaceLogService implements RCPLogger<InterfaceLogRequest> {
    MaskingService maskingService = new MaskingService();
    PublisherService publisherService = new PublisherService();


    public void log(InterfaceLogRequest request) {
        System.out.println("InterfaceLogService");
        maskingService.mask();
        publisherService.publish();
    }
}
