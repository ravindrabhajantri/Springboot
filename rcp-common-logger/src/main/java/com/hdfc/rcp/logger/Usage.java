package com.hdfc.rcp.logger;

import com.hdfc.rcp.logger.base.RCPLogger;
import com.hdfc.rcp.logger.factory.RCPLoggerFactory;
import com.hdfc.rcp.logger.request.DOTFLogRequest;
import com.hdfc.rcp.logger.request.InterfaceLogRequest;
import com.hdfc.rcp.logger.request.TransactionalLogRequest;
import com.hdfc.rcp.logger.service.DOTFLogger;
import com.hdfc.rcp.logger.service.InterfaceLogger;
import com.hdfc.rcp.logger.service.TransactionalLogger;


public class Usage {
    public static void main(String[] args) {

        TransactionalLogger transactionalLogger = RCPLoggerFactory.getTransactionalLogger();
        InterfaceLogger interfaceLogger = RCPLoggerFactory.getInterfaceLogger();
        DOTFLogger dotfLogger = RCPLoggerFactory.getDOTFLogger();

        TransactionalLogRequest transactionalLogRequest = new TransactionalLogRequest();
        transactionalLogger.log(transactionalLogRequest);

        InterfaceLogRequest interfaceLogRequest = new InterfaceLogRequest();
        interfaceLogger.log(interfaceLogRequest);

        DOTFLogRequest dotfLogRequest = new DOTFLogRequest();
        dotfLogger.log(dotfLogRequest);
    }
}
