package com.sunvalley.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayServiceApplication {

    /**
     * spring cloud gateway 配置方式之一，启动主程序配置，还有一种是配置文件配置
     * @param builder
     * @return
     */
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder
//            .routes()
//            .route(
//                r -> r.path("/api/medicalRecords/savePatientInfo/**").and()
//                    .uri("http://192.168.2.118:28080/api/medicalRecords/savePatientInfo")).build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }
}
