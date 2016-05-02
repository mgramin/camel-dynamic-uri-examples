package com.github.mgramin.camel_dynamic_route_test;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by maksim on 30.04.16.
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("context.xml");

        ctx.start();

        Thread.currentThread().sleep(1500);

        ctx.stop();
    }

}