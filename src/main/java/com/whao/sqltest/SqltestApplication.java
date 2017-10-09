package com.whao.sqltest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.whao.sqltest.mapper")
public class SqltestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqltestApplication.class, args);
	}
}
