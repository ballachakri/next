package com.next.utils;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {

    private static Logger logger = Logger.getLogger(Logs.class);





    public static void startTestLog(String testCaseName) {
     PropertyConfigurator.configure("log4j.properties");
        logger.info(".......................Test Started..........................................................!");
    }

    public static void endTestLog(String testCaseName) {
        logger.info(".......................Test Ended............................................................!");
    }

    public static void info(String msg) {
        logger.info(msg);
    }

    public static void warn(String msg) {
        logger.warn(msg);
    }

    public static void error(String msg) {
        logger.error(msg);
    }

    public static void debug(String msg) {
        logger.debug(msg);
    }
}
