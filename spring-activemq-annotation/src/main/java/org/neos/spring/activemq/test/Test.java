package org.neos.spring.activemq.test;

import org.neos.spring.activemq.producer.QueueSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// init spring context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jms-config.xml");

		// get bean from context
		QueueSender jmsMessageSender = (QueueSender) ctx.getBean("queueSender");

		jmsMessageSender.send("My message");
		jmsMessageSender.send("Otro message");

		
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
