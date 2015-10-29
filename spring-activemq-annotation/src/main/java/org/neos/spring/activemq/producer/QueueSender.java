package org.neos.spring.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {
	@Autowired
	private  JmsTemplate jmsQueueTemplate;


	public void send(final String message) {
		System.out.println("Enviando : " + message);
		jmsQueueTemplate.convertAndSend("myqueue",message);
		
	}
}
