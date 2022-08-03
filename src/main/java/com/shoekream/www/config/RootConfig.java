package com.shoekream.www.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"com.shoekream.www.service"})
@MapperScan(basePackages = {"com.shoekream.www.repository"})
@EnableAspectJAutoProxy
@EnableTransactionManagement
@EnableScheduling
public class RootConfig {

	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hikariConfig.setJdbcUrl("jdbc:log4jdbc:mariadb://mrdoe.ddns.net:56612/shoekream?characterEncoding=UTF-8&serverTimezone=Asia/Seoul");
		hikariConfig.setUsername("shoekream_user");
		hikariConfig.setPassword("shoekream_p@ss");
		hikariConfig.setMinimumIdle(5);

		HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
		return hikariDataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlFactoryBean = new SqlSessionFactoryBean();
		sqlFactoryBean.setDataSource(dataSource());
		sqlFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*.xml"));
		sqlFactoryBean.setTypeAliasesPackage("com.shoekream.www.domain");
		org.apache.ibatis.session.Configuration mybatisConf = new org.apache.ibatis.session.Configuration();
		mybatisConf.setMapUnderscoreToCamelCase(true);
		sqlFactoryBean.setConfiguration(mybatisConf);

		return sqlFactoryBean.getObject();
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
}