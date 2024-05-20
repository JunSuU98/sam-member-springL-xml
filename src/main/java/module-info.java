module SamMemberSpringL {
	exports su.login.controller;
	exports su.member.control;
	exports su.member.dto;
	exports su.member.frontcontroller;
	exports su.spring.test;
	exports su.member.dao;
	exports su.login.dao;
	exports su.member.handler;
	exports su.member.controller;
	exports su.member.service;

	requires java.naming;
	requires java.sql;
	requires org.slf4j;
	requires transitive spring.context;
	requires spring.jcl;
	requires spring.web;
	
	// added exports
	
	// added requires
	requires transitive jakarta.servlet;
	requires junit; // for DBCP TEST
	requires spring.test; // for DBCP TEST
	requires spring.beans; // @Autowired ....
	
	requires org.mybatis.spring; // mybatis
	requires lombok;
	

	// added opens
	opens configuration; // for configuration/config.xml (root-context.xml Mybatis SqlSessionFactoryBean)
	opens mapper; // for mapper/mapper.xml (root-context.xml Mybatis SqlSessionFactoryBean)
	
}