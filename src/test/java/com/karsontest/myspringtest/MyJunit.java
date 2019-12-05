package com.karsontest.myspringtest;


import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class MyJunit {
	@Autowired
	ApplicationContext context = null;
	@Test
	public void testReids() {
		
		System.out.println("数据源++++++++++++===="+context.getBean(DataSource.class));
		
	}
}
