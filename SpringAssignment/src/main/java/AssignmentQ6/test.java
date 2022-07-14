package AssignmentQ6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("my.xml");
		Vowel vowel=(Vowel)contex.getBean("vow1");
		//vowel.show();
		vowel.result();
	}

}
