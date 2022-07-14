package AssignmentQ4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp_Q4_Test {

	  public static void main(String[] args) {
	        List<Q4> list=new ArrayList<Q4>();
	        ApplicationContext ctx=new ClassPathXmlApplicationContext("my.xml");
	        Q4 obj= (Q4) ctx.getBean("ebean4");
	      Q4 obj1=(Q4) ctx.getBean("e1bean4");
	        list.add(obj);
	        list.add(obj1);

	        List<Q4> sorted=list.stream().sorted((e1,e2) ->Double.compare(e1.salary,e2.salary)).collect(Collectors.toList());


	        for (Q4 emp:sorted) {
	            emp.employeeDetails();
	        }
	    }
}
