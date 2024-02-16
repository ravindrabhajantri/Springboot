package com.hdfc.rcp.logger.utils;

import com.hdfc.rcp.logger.request.DOTFLogRequest;

public class MaskingService<T> {
    public void mask(T request) {

        System.out.println("Masking " + request.getClass());

        if (request.getClass() == DOTFLogRequest.class) {  //This can be extracted as a common function across all sevices
            DOTFLogRequest dotfLogRequest = (DOTFLogRequest) request;
            System.out.println("mask complete: " + dotfLogRequest.getRequest());
        }

    }
}
