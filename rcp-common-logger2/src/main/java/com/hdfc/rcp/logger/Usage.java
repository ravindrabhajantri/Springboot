package com.hdfc.rcp.logger;

import com.hdfc.rcp.logger.base.RCPLogger;
import com.hdfc.rcp.logger.factory.RCPLoggerFactory;
import com.hdfc.rcp.logger.request.DOTFLogRequest;
import com.hdfc.rcp.logger.request.InterfaceLogRequest;
import com.hdfc.rcp.logger.request.TransactionalLogRequest;


public class Usage {

    public static void main(String[] args) {

        RCPLogger<TransactionalLogRequest> transactionalLogRequestRCPLogger = RCPLoggerFactory.getLogger(TransactionalLogRequest.class);
        RCPLogger<InterfaceLogRequest> interfaceLogRequestRCPLogger = RCPLoggerFactory.getLogger(InterfaceLogRequest.class);
        RCPLogger<DOTFLogRequest> dotfLogRequestRCPLogger = RCPLoggerFactory.getLogger(DOTFLogRequest.class);

        TransactionalLogRequest transactionalLogRequest = new TransactionalLogRequest();
        transactionalLogRequestRCPLogger.log(transactionalLogRequest);

        InterfaceLogRequest interfaceLogRequest = new InterfaceLogRequest();
        interfaceLogRequestRCPLogger.log(interfaceLogRequest);
        DOTFLogRequest dotfLogRequest = new DOTFLogRequest();
        dotfLogRequestRCPLogger.log(dotfLogRequest);


    }
}

