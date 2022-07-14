package Assignment2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinctnumber {

	public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,3,2,4,2,7,3,8);
	List<Integer> sortedList=list.stream().sorted().distinct().collect(Collectors.toList());
	System.out.println(list);
	System.out.println(sortedList);
	
	}

}
