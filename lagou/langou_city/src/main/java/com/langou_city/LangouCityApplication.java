package com.langou_city;

import com.lagou.lagou_common.entity.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LangouCityApplication {

    public static void main(String[] args) {
        SpringApplication.run(LangouCityApplication.class, args);
    }

    @Bean
    public IdWorker getIdWorker(){
        return new IdWorker();
    }
}
