package myTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

	@Test
	public void ClassPathXmlApplicationTest(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationTest.xml");
	}
}
