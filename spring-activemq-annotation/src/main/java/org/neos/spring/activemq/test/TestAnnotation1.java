package org.neos.spring.activemq.test;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.neos.spring.activemq.annotation.JmsConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class TestAnnotation1 {

	 public static void main(String args[]) throws Throwable {
	        AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(JmsConfiguration.class);

	        MessageCreator messageCreator = new MessageCreator() {
	                    @Override
	                    public Message createMessage(Session session) throws JMSException {
	                        return session.createTextMessage("hola mundo jms!");
	                    }
	                };
	        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
	        System.out.println("enviando un mensaje: " +"hola mundo jms!");
	        jmsTemplate.send("qms.queue2", messageCreator);

	        context.close();
	    }

}
