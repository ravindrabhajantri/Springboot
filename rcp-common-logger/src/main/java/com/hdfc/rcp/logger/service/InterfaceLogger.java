package com.hdfc.rcp.logger.service;

import com.hdfc.rcp.logger.base.RCPLogger;
import com.hdfc.rcp.logger.request.InterfaceLogRequest;

public class InterfaceLogger extends RCPLogger {
    InterfaceLogRequest request;


    public void log(InterfaceLogRequest request) {
        System.out.println("InterfaceLogService");
        maskingService.mask();
        publisherService.publish();
    }
}
