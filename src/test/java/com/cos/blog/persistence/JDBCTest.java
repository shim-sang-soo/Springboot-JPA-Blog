package com.cos.blog.persistence;

import static org.assertj.core.api.Assertions.catchException;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class JDBCTest {
	
	// static 블록 -- static 변수 초기화 할때/  딱한번만 실행
	static {
		try {
			Class.forName("oracle.jdbc.dirver.OracleDirver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 오라클 DB와 연결이 되는지 확인 - Connection만 확인
	@Test
	public void testConnection() {
		
		try(Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@192.168.111.132:1539:xe", "c##spring", "spring00")){
					log.info(con);
		} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
	}
}