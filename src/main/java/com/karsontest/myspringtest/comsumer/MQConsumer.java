package com.karsontest.myspringtest.comsumer;

import javax.jms.MapMessage;

import org.apache.activemq.command.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MQConsumer {

 	//@Autowired
 	//JmsTemplate jmsTemplate;
    //使用JmsListener配置消费者监听的队列，其中Message是接收到的消息  
	//@JmsListener(destination = "myTopicMQ")  
    public void receiveQueue(Message message) {
		try {
			System.out.println("============!!!!!!!!!!!!!!!!");
			MapMessage mapMessage = (MapMessage) message;
			String info = mapMessage.getString("info");
			System.out.println("客户端==我接收到消息了！！！！"+info);
		} catch (Exception e) {
			e.printStackTrace();
		}
    } 
	
	
	
}
