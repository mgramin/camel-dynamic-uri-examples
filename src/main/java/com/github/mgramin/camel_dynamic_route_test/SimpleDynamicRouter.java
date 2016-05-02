package com.github.mgramin.camel_dynamic_route_test;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangeProperty;
import org.apache.camel.Header;

/**
 * Created by maksim on 30.04.16.
 */
public class SimpleDynamicRouter {

    public String getRoute(@Header(Exchange.SLIP_ENDPOINT) String previous, @ExchangeProperty("propertyName1") String propertyName1) {
        if (previous != null) {
            System.out.println("!!!!!!!!!!! " + previous);
            return null;
        }

        System.out.println("propertyName1 = " + propertyName1);

        return "activemq:queue:test_queue,file:output_files,file:output_files_2,file:output_files_3,file:output_files_4";
    }

}
