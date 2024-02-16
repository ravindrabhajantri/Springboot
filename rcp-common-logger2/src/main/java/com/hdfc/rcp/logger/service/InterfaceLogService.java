package com.hdfc.rcp.logger.service;

import com.hdfc.rcp.logger.base.AbstractRCPLogger;
import com.hdfc.rcp.logger.request.InterfaceLogRequest;

public class InterfaceLogService extends AbstractRCPLogger<InterfaceLogRequest> {

    public InterfaceLogService() {
        System.out.println("Creating InterfaceLogService");
        isMaskingEnabled = true;
        isPublishEnabled = true;
        isEncryptionEnabled = true;
        isHashingEnabled = true;
    }
}
