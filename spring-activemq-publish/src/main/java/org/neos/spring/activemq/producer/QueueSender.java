package org.neos.spring.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {
	@Autowired
	private  JmsTemplate jmsTopicTemplate;


	public void send(final String message) {
		System.out.println("Enviando : " + message);
		//default queue
		jmsTopicTemplate.convertAndSend(message);
		//jmsTemplate.convertAndSend("Queue.Name", message);
	}
}
