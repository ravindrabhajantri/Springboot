package com.hdfc.rcp.logger.factory;

import com.hdfc.rcp.logger.base.RCPLogger;
import com.hdfc.rcp.logger.base.RCPLoggerType;
import com.hdfc.rcp.logger.request.DOTFLogRequest;
import com.hdfc.rcp.logger.request.InterfaceLogRequest;
import com.hdfc.rcp.logger.request.TransactionalLogRequest;

public class RCPLoggerFactory {
    public static <T> RCPLogger<T> getLogger(Class<T> rcpLogRequestType) {
        if (rcpLogRequestType == TransactionalLogRequest.class) {
            return RCPLoggerType.TRANSACTIONAL.create();
        }
        if (rcpLogRequestType == InterfaceLogRequest.class) {
            return RCPLoggerType.INTERFACE.create();
        }
        if (rcpLogRequestType == DOTFLogRequest.class) {
            return RCPLoggerType.DOTF.create();
        }
        return null;
    }
}
