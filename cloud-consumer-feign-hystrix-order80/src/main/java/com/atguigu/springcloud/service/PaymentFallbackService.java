package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String getPaymentInfo_OK(Integer id) {

        return "-------PaymentFallbackService getPaymentInfo_OK o(╥﹏╥)o";
    }

    @Override
    public String getPaymentInfo_Timeout(Integer id) {

        return "-------PaymentFallbackService getPaymentInfo_Timeout o(╥﹏╥)o";
    }
}
