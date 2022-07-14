package Assignment3;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class employee {

	public static void main(String[] args) {
String names=Arrays.asList("Ankush","Sumedha","Shreya","Bobby").stream().distinct().sorted().collect(Collectors.joining(","));
System.out.println(names);
	}

}
