package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class a1 {

	public static void main(String[] args) {
System.out.println("enter marks");
Scanner sc=new Scanner(System.in);
List<Integer> l=new ArrayList<Integer>();
for(int i=0;i<5;i++)
{
	int sub=sc.nextInt();
	l.add(sub);
}

for(int c:l)
{
	System.out.println(c);
}
Double avg=l.stream().collect(Collectors.averagingDouble(e->e));
System.out.println("avg="+avg);
	}

}
