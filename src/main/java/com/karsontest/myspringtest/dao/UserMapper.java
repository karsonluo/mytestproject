package com.karsontest.myspringtest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.karsontest.myspringtest.entity.User;

@Mapper
public interface UserMapper {

	
	 List<User> hello();
	
	
}
