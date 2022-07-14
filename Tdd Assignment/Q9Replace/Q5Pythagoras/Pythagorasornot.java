package Q5Pythagoras;

public class Pythagorasornot {
public static boolean pytha(int a,int b,int c)
{
	int a1=a*a;
	int b1=b*b;
	int c1=c*c;
	if(a1==b1+c1 || b1==a1+c1 || c1==a1+b1)
		
	return true;
	else
		return false;
	
	
	
 }
public static void main(String[] args) {
	System.out.println(Pythagorasornot.pytha(5, 3, 4));
}
}
