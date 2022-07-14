package AssignmentQ2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
		

		ApplicationContext co=new ClassPathXmlApplicationContext("my.xml");
		
		numb avg=(numb)co.getBean("ave");
		avg.show();
		
		
		
	}

}
