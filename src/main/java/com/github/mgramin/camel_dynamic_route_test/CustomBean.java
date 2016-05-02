package com.github.mgramin.camel_dynamic_route_test;

import org.apache.camel.Header;
import org.apache.camel.Properties;
import org.apache.camel.Property;

/**
 * Created by maksim on 02.05.16.
 */
public class CustomBean {

    public String get(String testHeader) {
        return testHeader;
    }

}
