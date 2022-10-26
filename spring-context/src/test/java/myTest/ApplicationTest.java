package myTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.testBean.MyClassPathXmlApplicationContext;

public class ApplicationTest {

	@Test
	public void ClassPathXmlApplicationTest(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationTest.xml");
//		ApplicationContext applicationContext=new MyClassPathXmlApplicationContext("applicationTest${username}.xml");
		applicationContext.getBean("test");
	}
}
