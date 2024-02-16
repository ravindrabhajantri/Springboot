package com.hdfc.rcp.logger.utils;

import com.hdfc.rcp.logger.request.DOTFLogRequest;

public class HashService<T> {
    public void hash(T request) {
        System.out.println("hashing " + request.getClass());

        if (request.getClass() == DOTFLogRequest.class) {  //This can be extracted as a common function across all sevices
            DOTFLogRequest dotfLogRequest = (DOTFLogRequest) request;
            System.out.println("hashing complete: " + dotfLogRequest.getRequest());
        }
    }


}
