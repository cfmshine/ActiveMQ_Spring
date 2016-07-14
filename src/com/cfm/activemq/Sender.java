package com.cfm.activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.core.support.JmsGatewaySupport;

public class Sender extends JmsGatewaySupport{
	
	public void sendMessage(final String msg) {
		
		System.out.println(getJmsTemplate());
		
		this.getJmsTemplate().send(new MessageCreator(){

			public Message createMessage(Session session) throws JMSException {
				System.out.println(msg);
				TextMessage message = session.createTextMessage(msg);
				message.setStringProperty("JMSUserId", "123456");
				message.setStringProperty("JMSAppId", "7s3fk93dkwon9472l20hu");
				return message;
			}
			
		});
	}
	
}
