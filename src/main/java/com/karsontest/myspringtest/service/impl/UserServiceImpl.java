package com.karsontest.myspringtest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karsontest.myspringtest.dao.UserMapper;
import com.karsontest.myspringtest.entity.User;
import com.karsontest.myspringtest.service.UserService;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    
	@Override
	public List<User> hello() {

		
		return userMapper.hello();
	}

}
