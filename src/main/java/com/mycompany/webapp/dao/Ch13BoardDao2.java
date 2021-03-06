package com.mycompany.webapp.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

//클래스 이름을 첫자를 소문자로한(기본 생성자로 객체생성) 관리 객체가 만들어짐
@Repository
public class Ch13BoardDao2 { 
	private static final Logger logger = LoggerFactory.getLogger(Ch13BoardDao2.class);
	
	public Ch13BoardDao2() {
		logger.info("실행"); // 생성자가 출력되고 객체가 만들어 졌는지 확인
	}
	
	public void update() {
		logger.info("실행");
	}
}
