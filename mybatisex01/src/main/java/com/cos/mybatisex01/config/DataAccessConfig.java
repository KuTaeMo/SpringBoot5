package com.cos.mybatisex01.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

// DB 접근 설정 파일
@Configuration
public class DataAccessConfig {
	
	// SQL Session : connection + authentification
	// SQL Session을 만들기 위한 공장 생성
	// 1. DataSource 등록 => yml에서 만들어진 것을 가져옴.
	// 2. xml 파일 연결
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean=new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("mapper/*.xml"));
		return sessionFactoryBean.getObject();
	} // 아직 sql session 만들어지지 않음 공장만 만들어짐!
	
	// SQL Session만들기
	// 1. SQL Session은 인터페이스여서 직접 만들면 번거롭기 때문에 SQLSessionTemplate 사용(편함)
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
