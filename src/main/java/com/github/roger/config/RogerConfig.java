package com.github.roger.config;

import com.github.roger.component.RogerAspect;
import com.github.roger.component.RogerLog;
import com.github.roger.condition.RogerCustomConditional;
import com.github.roger.registration.RogerCustomBeanRegistrar;
import com.github.roger.selector.RogerCustomSelector;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {RogerCustomSelector.class,RogerCustomBeanRegistrar.class})
@Slf4j
public class RogerConfig {

    @Bean
    public RogerAspect rogerAspect(){
        log.info("实例化 RogerAspect 组件...");
        return new RogerAspect();
    }

    @Bean
    @Conditional(value = RogerCustomConditional.class)
    public RogerLog rogerLog(){
        log.info("实例化 RogerLog 组件...");
        return new RogerLog();
    }
}
