package com.hdfc.rcp.logger.utils;

import com.hdfc.rcp.logger.request.DOTFLogRequest;

public class EncryptionService<T> {
    public void encrypt(T request) {
        System.out.println("encrypting " + request.getClass());

        if (request.getClass() == DOTFLogRequest.class) {  //This can be extracted as a common function across all sevices
            DOTFLogRequest dotfLogRequest = (DOTFLogRequest) request;
            System.out.println("encrypting complete: " + dotfLogRequest.getRequest());
        }
    }
}
