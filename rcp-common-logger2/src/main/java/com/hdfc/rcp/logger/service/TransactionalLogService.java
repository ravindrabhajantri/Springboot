package com.hdfc.rcp.logger.service;

import com.hdfc.rcp.logger.base.AbstractRCPLogger;
import com.hdfc.rcp.logger.request.TransactionalLogRequest;

public class TransactionalLogService extends AbstractRCPLogger<TransactionalLogRequest> {
    public TransactionalLogService() {
        System.out.println("Creating TransactionalLogService");
        isMaskingEnabled = true;
        isPublishEnabled = true;
        isEncryptionEnabled = true;
        isHashingEnabled = true;
    }
}
