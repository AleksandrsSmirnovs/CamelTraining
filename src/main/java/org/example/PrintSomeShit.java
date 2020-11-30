package org.example;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

@Component
public class PrintSomeShit {
    public void printSomeShit(Exchange exchange) {
        System.out.println(exchange.getIn().getBody());
    }
}
