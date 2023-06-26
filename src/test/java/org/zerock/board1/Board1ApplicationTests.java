package org.zerock.board1;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class Board1ApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() {
	}
	// mybatis connection check
	@Test
	public void testConnection(){

		try(Connection conn= dataSource.getConnection()){
			log.info("Get connection.....");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
