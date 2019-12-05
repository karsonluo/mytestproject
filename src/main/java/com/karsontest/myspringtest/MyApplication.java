package com.karsontest.myspringtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@MapperScan("com.karsontest.myspringtest.dao")
//@EnableScheduling
public class MyApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
          return application.sources(MyApplication.class);
      }
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}
	
	
}
