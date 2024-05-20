package su.spring.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // <= 이 부분을 주석해제하니까 root-context.xml 을 찾지 못하는 오류가 발생한다
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DBCP {
	
	private static final Logger logger = LoggerFactory.getLogger(DBCP.class);

//	@Autowired
//	DataSource dataSource;

	@Test
	public void test() {
//		Connection connection = null;
//		
//		try {
//			connection = dataSource.getConnection();
//			logger.info("" + connection);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		System.out.println("hello test");
	}

}
