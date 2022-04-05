package com.example.spring.boot.logger;

import com.example.spring.boot.logger.service.Addition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(Starter.class);

    @Autowired
    private Addition addition;

    @Override
    public void run(String... args) throws Exception {
        log.info("Starter class has run");
        log.error("Error msg printed");
        log.trace("Trace msg printed");
        log.debug("Debug msg printed");
        this.calculate();
        addition.sum(10,10);
    }

    private void calculate() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            log.error(e.getMessage());
        }
    }

}
