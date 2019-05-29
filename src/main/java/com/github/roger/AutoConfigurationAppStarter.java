package com.github.roger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

@Slf4j
@SpringBootApplication
public class AutoConfigurationAppStarter {

    public static void main(String[] args) {
        log.info("启动RogerSpringBoot自动装配项目...");
        SpringApplication.run(AutoConfigurationAppStarter.class,args);
    }
}
