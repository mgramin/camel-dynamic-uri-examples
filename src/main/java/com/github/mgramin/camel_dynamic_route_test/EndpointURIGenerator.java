package com.github.mgramin.camel_dynamic_route_test;

import org.apache.camel.Exchange;
import org.apache.camel.Header;

import java.util.Random;

/**
 * Created by maksim on 02.05.16.
 */
public class EndpointURIGenerator {

    public String genURI(String endpointName, @Header(Exchange.SLIP_ENDPOINT) String previous) {
        if (previous != null) {
            return null;
        }
        return endpointName + ":" + String.valueOf(new Random().nextInt(10000));
    }

}
