package com.hdfc.rcp.logger.factory;

import com.hdfc.rcp.logger.service.DOTFLogger;
import com.hdfc.rcp.logger.service.InterfaceLogger;
import com.hdfc.rcp.logger.service.TransactionalLogger;

public class RCPLoggerFactory {
//        public getTransactionalLogger() {
//            return new ApplicationLogService();
//        }
        public static InterfaceLogger getInterfaceLogger() {
            return new InterfaceLogger();
        }
        public static TransactionalLogger getTransactionalLogger() {
            return new TransactionalLogger();
        }
        public static DOTFLogger getDOTFLogger() {
            return new DOTFLogger();
        }

}
