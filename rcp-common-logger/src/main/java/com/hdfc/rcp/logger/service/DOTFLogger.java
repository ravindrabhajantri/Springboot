package com.hdfc.rcp.logger.service;

import com.hdfc.rcp.logger.base.RCPLogger;
import com.hdfc.rcp.logger.request.DOTFLogRequest;

public class DOTFLogger extends RCPLogger {
    DOTFLogRequest request;

    public void log(DOTFLogRequest request){
        System.out.println("DOTFLogService");
        maskingService.mask();
        publisherService.publish();
    }

}
