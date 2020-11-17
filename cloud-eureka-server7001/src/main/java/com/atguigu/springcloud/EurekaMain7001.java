package com.atguigu.springcloud;

@SpringBootApplication
// Eureka Server服务器启动类，接受其他微服务注册进来
@EnableEurekaServer
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
