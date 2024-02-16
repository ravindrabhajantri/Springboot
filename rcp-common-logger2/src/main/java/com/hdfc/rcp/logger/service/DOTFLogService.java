package com.hdfc.rcp.logger.service;

import com.hdfc.rcp.logger.base.AbstractRCPLogger;
import com.hdfc.rcp.logger.request.DOTFLogRequest;

public class DOTFLogService extends AbstractRCPLogger<DOTFLogRequest> {
    public DOTFLogService() {
        System.out.println("Creating DOTFLogService");
        isMaskingEnabled = true;
        isPublishEnabled = true;
        isEncryptionEnabled = true;
        isHashingEnabled = true;
    }
}
