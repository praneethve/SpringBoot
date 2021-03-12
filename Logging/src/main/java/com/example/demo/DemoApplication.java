package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
   private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
   
   public static void main(String[] args) {
	   logger.debug("this is a 0 message");
	   logger.info("this is a 1 message");
      logger.warn("this is a 2 message");
      logger.error("this is a 3 message");
      SpringApplication.run(DemoApplication.class, args);
   }
}
