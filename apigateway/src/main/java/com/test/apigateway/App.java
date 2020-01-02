
package com.test.apigateway;

import com.test.apigateway.security.SecurityConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class App {
  
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public SimpleFilter simpleFilter(){
        return new SimpleFilter();
    }
    // @Bean SecurityConfig securityConfig(){
    //     return new SecurityConfig();
    // }
}
