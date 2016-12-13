package com.steven.service;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.steven.bean.ConditionUser;
import com.steven.dao.UserDao;

public class UserDaoService {
	@Test
	public void testFindUserByName() throws Exception {
		String pathXml="context-database.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(pathXml);
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		ConditionUser conditionUser=new ConditionUser();
		conditionUser.setMinId(1);
		conditionUser.setMaxId(3);
		System.out.println(userDao.findUserByName("s"));
	}
}
