package com.gzwl.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.gzwl.demo.dao")
public class SbLayuiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbLayuiDemoApplication.class, args);
	}

}