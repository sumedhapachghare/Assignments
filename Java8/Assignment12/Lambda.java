package Assignment12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
List<Integer>list=Arrays.asList(56,90,67,34,23);
List<Integer> LE=list.stream().distinct().sorted().collect(Collectors.toList());
System.out.println(LE);
	}

}
