package Assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Emp1 {

	public static void main(String[] args) {
		List<Emp> elist=new ArrayList<Emp>();
		elist.add(new Emp(1,"sumedha",24000f));
		elist.add(new Emp(2,"ajit",34000f));
		elist.add(new Emp(3,"sushil",44000f));
		elist.add(new Emp(4,"shreya",34000f));
		elist.add(new Emp(5,"shraddha",30000f));
		elist.add(new Emp(6,"sid",35000f));
		elist.add(new Emp(7,"ankush",30000f));
		elist.add(new Emp(8,"avinash",23000f));
		elist.add(new Emp(9,"ashu",12000f));
		elist.add(new Emp(10,"asifa",45000f));
		Map<Integer,String> proMap=elist.stream().collect(Collectors.toMap(p->p.empid,p->p.ename));
		System.out.println(proMap);
		Set<String> EmpSet=elist.stream().map(p->p.ename).collect(Collectors.toSet());
System.out.println(EmpSet);
	}

}
