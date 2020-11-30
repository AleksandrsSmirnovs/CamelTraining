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
        Thread.sleep(1000);
        context.stop();
        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        PersonType pt = (PersonType) JAXBIntrospector.getValue(unmarshaller.unmarshal(new File("src/data/message2.xml")));
        System.out.println(pt.getFirstName());


    }
}
