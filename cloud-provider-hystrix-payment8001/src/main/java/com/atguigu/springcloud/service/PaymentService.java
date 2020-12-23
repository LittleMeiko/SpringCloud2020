package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    /**
     * 正常运行，肯定OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池："  + Thread.currentThread().getName() + " PaymentInfo_OK,id: " + id + "\t" + "O(∩_∩)O哈哈~";
    }

    /**
     * 模拟响应超时
     * @param id
     * @return
     */
    public String paymentInfo_Timeout(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "线程池："  + Thread.currentThread().getName() + " PaymentInfo_Timeout,id: " + id + "\t" + "O(∩_∩)O哈哈~" + "耗时(秒)" + timeNumber;
    }
}
