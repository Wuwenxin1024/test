package com.wwx.test;



import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wwx.bean.User;
import com.wwx.mapper.UserMapper;

public class LoginTest {

	public static void main(String[] args) {
		
		InputStream inputStream = LoginTest.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User user = new User();
		user.setUsername("Œ‚ŒƒˆŒ");
		user.setPassword("111111");
		
		System.out.println(userMapper.queryUserByLoginUser(user));
	}

}
