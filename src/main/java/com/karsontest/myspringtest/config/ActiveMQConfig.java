package com.karsontest.myspringtest.config;

import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveMQConfig {
	@Bean
	public Queue queue() {
		
		 return new ActiveMQQueue("myActiveMQ");
	}
	@Bean
	public Topic topic() {
		return new ActiveMQTopic("myTopicMQ");
	}

	
	
}
