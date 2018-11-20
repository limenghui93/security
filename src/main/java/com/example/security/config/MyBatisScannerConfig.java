package com.example.security.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lmh
 * @date 2018/11/20 17:35
 * @desc
 */
@Configuration
public class MyBatisScannerConfig {
	@Bean
	public MapperScannerConfigurer MapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.example.security.dao");
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		return mapperScannerConfigurer;
	}

}
