package AssignmentQ9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {
	public static void main(String[] args) {
		List<distance> clist = new ArrayList<distance>();
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("my.xml");
		
		
		distance ct1 = (distance) contex.getBean("city1");
		distance ct2 = (distance) contex.getBean("city2");
		distance ct3 = (distance) contex.getBean("city3");
		distance ct4 = (distance) contex.getBean("city4");

		clist.add(ct1);
		clist.add(ct2);
		clist.add(ct3);
		clist.add(ct4);

		System.out.println("enter from city name");
		String fromCity1 = sc.next();

		System.out.println("enter to city name");
		String toCity1 = sc.next();

		List<distance> matchedList = clist.stream().filter(c -> c.getFromCity().equalsIgnoreCase(fromCity1))
				.filter(c -> c.getToCity().equalsIgnoreCase(toCity1)).collect(Collectors.toList());

		if (!matchedList.isEmpty()) {
			for (distance cities : matchedList) {
				System.out.print("distance between "+cities.getFromCity() +" & "+cities.getToCity()+" is "+cities.getDistance() + " Km");

			}
		} else
			System.out.println("data not available");
	}
}


