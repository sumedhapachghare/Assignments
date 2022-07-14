package Q4Armstrongornot;

public class Armstrong {
public static int armstrong(int a)
{
	int sum=0,i;
	for(i=1;i<=9;i++)
	{
		int mult=i*i*i;
		sum=sum+mult;
	}
	System.out.println(sum);
	return sum;
}
public static void main(String[] args) {
	Armstrong.armstrong(153);
}
}
