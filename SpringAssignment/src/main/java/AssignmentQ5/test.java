package AssignmentQ5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("my.xml");
		maxnumber max=(maxnumber)contex.getBean("max1");
		
		max.show();
		max.maxNum();
		
	}

}
