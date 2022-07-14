package AssignmentQ8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("my.xml");
		ascending item=(ascending) contex.getBean("itemlist");
		
		item.show();
		System.out.println("--------------------------\n");
		
		
	item.ascending();
	System.out.println("--------------------------\n");
	item.descending();
	System.out.println("--------------------------\n");
		
	item.removeDuplicate();
		
	}

}
