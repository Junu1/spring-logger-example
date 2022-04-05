package com.example.spring.boot.logger.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Addition {
    private static final Logger log = LoggerFactory.getLogger(Addition.class);

    public void sum(int a, int b) {
        int c = a + b;
        log.debug("Sum is:" + c);
    }
}
