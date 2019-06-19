package edu.sse.ustc.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** 日志测试
 * @author imarklei90
 * @since 2019.06.19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTest {

	private final Logger logger = LoggerFactory.getLogger(LogTest.class);

	@Test
	public void test1(){
		logger.info("info...");
		logger.debug("debug...");
		logger.error("error...");
	}

}
