package com.cfm.activemq;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {
	ApplicationContext ctx = null;
	
	{
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void SenderTest() {
		Sender sender = ctx.getBean(Sender.class);
		sender.sendMessage("Hello, My name is Firmin");
	}
	
	@Test
	public void ReceiverTest() {
		Receiver receiver = ctx.getBean(Receiver.class);
		receiver.receiverMessage();
	}

}
