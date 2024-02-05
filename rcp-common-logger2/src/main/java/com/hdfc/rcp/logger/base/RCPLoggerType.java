package com.hdfc.rcp.logger.base;

import com.hdfc.rcp.logger.request.DOTFLogRequest;
import com.hdfc.rcp.logger.request.InterfaceLogRequest;
import com.hdfc.rcp.logger.request.TransactionalLogRequest;
import com.hdfc.rcp.logger.service.DOTFLogService;
import com.hdfc.rcp.logger.service.InterfaceLogService;
import com.hdfc.rcp.logger.service.TransactionalLogService;

public enum RCPLoggerType {
    TRANSACTIONAL {
        @Override
        public RCPLogger<TransactionalLogRequest> create() {
            return new TransactionalLogService();
        }
    },
    INTERFACE {
        @Override
        public RCPLogger<InterfaceLogRequest> create() {
            return new InterfaceLogService();
        }
    },
    DOTF {
        @Override
        public RCPLogger<DOTFLogRequest> create() {
            return new DOTFLogService();
        }
    };

    public abstract <T> RCPLogger<T> create();
}
