package com.hdfc.rcp.logger.base;

import com.hdfc.rcp.logger.utils.EncryptionService;
import com.hdfc.rcp.logger.utils.HashService;
import com.hdfc.rcp.logger.utils.MaskingService;
import com.hdfc.rcp.logger.utils.PublisherService;

public abstract class AbstractRCPLogger<T> implements RCPLogger<T> {
    protected boolean isMaskingEnabled;
    protected boolean isHashingEnabled;
    protected boolean isEncryptionEnabled;
    protected boolean isPublishEnabled;
    MaskingService maskingService = new MaskingService();
    EncryptionService encryptionService = new EncryptionService();
    HashService hashService = new HashService();
    PublisherService publisherService = new PublisherService();

    @Override
    public void log(T obj) {
        if (isMaskingEnabled)
            maskingService.mask(obj);
        if (isHashingEnabled)
            hashService.hash(obj);
        if (isEncryptionEnabled)
            encryptionService.encrypt(obj);
        if (isPublishEnabled)
            publisherService.publish(obj)
                    ;
    }
}
