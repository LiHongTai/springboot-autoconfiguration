package com.github.roger.component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RogerCustomDao {

    public RogerCustomDao() {
        log.info("通过组件 ImportBeanDefinitionRegistrar 实例化 RogerCustomDao...");
    }
}
