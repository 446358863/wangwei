package com.cn.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.ssm.dao.userMapper;
import com.cn.ssm.pojo.user;
import com.cn.ssm.service.userService;

@Service("userService")
public class userServiceImpl implements userService {
	@Resource
	private userMapper userMapper;
	@Override
	public user getUserById(int userId){
		return this.userMapper.selectByPrimaryKey(userId);
	}
	
}
