package AssignmentQ3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String args[]) {
		ApplicationContext objctx=new ClassPathXmlApplicationContext("my.xml");
		interest obj=(interest) objctx.getBean("objint");
        obj.show();
}
}