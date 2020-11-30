package org.example;

import org.example.genClasses.ObjectFactory;
import org.example.genClasses.PersonType;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException, JAXBException {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF\\spring\\camel-context.xml");
        context.start();
        Thread.sleep(3000);
        context.stop();


    }
}
