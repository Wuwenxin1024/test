package com.wwx.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wwx.bean.User;
import com.wwx.mapper.UserMapper;
/**
 * 
 * @author Œ‚ŒƒˆŒ
 *
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public User queryUserByLoginUser(User user) {
		return userMapper.queryUserByLoginUser(user);
	}

}
