package org.leason.learn.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lee on 2018/1/4.
 */
public class LogTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        LOGGER.trace("======trace");
        LOGGER.debug("======debug");
        LOGGER.info("======info");
        LOGGER.warn("======warn");
        LOGGER.error("======error");
    }
}
