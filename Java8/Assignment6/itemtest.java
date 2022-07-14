package Assignment6;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class itemtest {

	public static void main(String[] args) {
		List<item> Ilist=new ArrayList<item>();
		Ilist.add(new item(1,"Tea",10f));
		Ilist.add(new item(2,"pen",10f));
		Ilist.add(new item(1,"shoes",500f));
		Ilist.add(new item(1,"mobile",9000f));
		Ilist.add(new item(1,"mouse",350f));
		Ilist.add(new item(1,"shirts",650f));
		Ilist.add(new item(1,"pants",550f));
double avgprice=Ilist.stream().collect(Collectors.averagingDouble(s1 -> s1.itemprice));
System.out.println("avg price"+avgprice);
List <Float> ilist=Ilist.stream().filter(p -> p.itemprice>=avgprice).map(p ->p.itemprice).collect(Collectors.toList());
System.out.println(ilist);
	}

}
