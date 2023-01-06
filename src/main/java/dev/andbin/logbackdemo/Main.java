/*
SPDX-FileCopyrightText: Copyright (c) 2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.logbackdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        logger.info("Application main started");
        Thread.sleep(2000);
        logger.info("Application main terminated");
    }
}
