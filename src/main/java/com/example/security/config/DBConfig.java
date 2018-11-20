package com.example.security.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author lmh
 * @date 2018/11/20 17:15
 * @desc
 */
@Configuration
public class DBConfig {
	@Autowired
	private Environment env;

	@Bean(name="dataSource")
	public DataSource dataSource() throws PropertyVetoException {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(env.getProperty("ms.db.driverClassName"));
		dataSource.setUrl(env.getProperty("ms.db.url"));
		dataSource.setUsername(env.getProperty("ms.db.username"));
		dataSource.setPassword(env.getProperty("ms.db.password"));
		dataSource.setMaxActive(20);
		return dataSource;
	}

}
