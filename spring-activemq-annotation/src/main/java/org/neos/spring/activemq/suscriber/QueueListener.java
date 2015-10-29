package org.neos.spring.activemq.suscriber;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueListener  {
	
	@JmsListener(destination="myqueue")
	public void onMessage(final Message message) {
		System.out.println("EN EL LISTENER.....");
		if (message instanceof TextMessage) {
			final TextMessage textMessage = (TextMessage) message;
			try {
				System.out.println("Recivido listener 1: " + textMessage.getText());
			} catch (final JMSException e) {
				e.printStackTrace();
			}
		}
	}
}
