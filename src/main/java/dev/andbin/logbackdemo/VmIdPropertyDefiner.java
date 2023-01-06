/*
SPDX-FileCopyrightText: Copyright (c) 2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.logbackdemo;

import java.lang.management.ManagementFactory;

import ch.qos.logback.core.PropertyDefinerBase;

/**
 * Custom implementation of PropertyDefiner interface to define a property
 * with the identifier of the running Java virtual machine instance.
 */
public class VmIdPropertyDefiner extends PropertyDefinerBase {
    @Override
    public String getPropertyValue() {
        return ManagementFactory.getRuntimeMXBean().getName();
    }
}
