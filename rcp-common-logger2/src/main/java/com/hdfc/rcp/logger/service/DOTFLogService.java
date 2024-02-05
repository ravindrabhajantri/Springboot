package com.hdfc.rcp.logger.service;

import com.hdfc.rcp.logger.base.RCPLogger;
import com.hdfc.rcp.logger.request.DOTFLogRequest;
import com.hdfc.rcp.logger.utils.MaskingService;
import com.hdfc.rcp.logger.utils.PublisherService;

public class DOTFLogService implements RCPLogger<DOTFLogRequest> {

    MaskingService maskingService = new MaskingService();
    PublisherService publisherService = new PublisherService();

    @Override
    public void log(DOTFLogRequest dotfLogRequest) {
        System.out.println("DOTFLogService");
        maskingService.mask();
        publisherService.publish();
    }
}
