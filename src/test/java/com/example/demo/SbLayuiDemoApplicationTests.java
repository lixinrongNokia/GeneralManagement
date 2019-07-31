package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gzwl.demo.SbLayuiDemoApplication;
import com.gzwl.demo.service.personnel.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { SbLayuiDemoApplication.class })
public class SbLayuiDemoApplicationTests {
	@Autowired
	@Lazy
	private EmployeeService employeeService;
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	public void addTest() {
		redisTemplate.opsForValue().set("name", "高石花道");
	}
	
	@Test
	public void getTest() {
		Object object = redisTemplate.opsForValue().get("name");
		System.out.println(object.toString());
	}

}
