package com.pluralsight.fundamentals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentalsApplication {

    static Logger logger = LoggerFactory.getLogger(FundamentalsApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(FundamentalsApplication.class, args);
        logger.info("Printing logger.info");
        logger.trace("This is a trace Logger. This won't be printed in console until it is activated in application.properties. ");
        //Added in application.properties file (
        // #######LOGGING############
        //logging.level.org.springframework=Trace
        //logging.level.com.pluralsight.fundamentals=Trace)

    }

}
