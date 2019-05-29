package com.github.roger.component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RogerCustomComponent {

    public RogerCustomComponent() {
        log.info("通过 ImportSelector 实例化RogerCustomComponent....");
    }
}
