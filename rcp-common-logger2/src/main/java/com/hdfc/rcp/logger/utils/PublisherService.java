package com.hdfc.rcp.logger.utils;

import com.hdfc.rcp.logger.request.DOTFLogRequest;

public class PublisherService<T> {
    public void publish(T request) {
        System.out.println("Publishing " + request.getClass());

        if (request.getClass() == DOTFLogRequest.class) {  //This can be extracted as a common function across all sevices
            DOTFLogRequest dotfLogRequest = (DOTFLogRequest) request;
            System.out.println("Publishing complete: " + dotfLogRequest.getRequest());
        }
    }
}
