package com.karsontest.myspringtest.producter;

import javax.jms.MapMessage;
import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQMapMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
//@EnableScheduling
public class MQProducter {

	 	@Autowired
	 	JmsTemplate jmsTemplate;

	    @Autowired
	    Queue queue;
	    @Autowired
	    Topic topic;
	    
	    @Scheduled(fixedDelay=3000)//每3s执行1次
	    public void send() {
	        try {
	 		
	 		   MapMessage mapMessage = new ActiveMQMapMessage();
	 		   mapMessage.setString("info", "+++测试====发送消息");
	 		//方法一：添加消息到消息队列,还要注意配置文件是选择哪种发送方式
	 		   //jmsTemplate.convertAndSend(queue, mapMessage);

	 		  jmsTemplate.convertAndSend(topic, mapMessage);
	 		   
	 		} catch (Exception e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	     }

}
