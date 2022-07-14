package Q7NumberPalindrome;

public class PalindromeNumber {
	public static boolean checkpalindrome(int a) {
		int d=0;
		int r=0;
		int sum=0;
		int temp=0;
		temp=d;
		
		while(d>0)
		{
		r=d%10;
		sum=(sum*10)+r;
		d=d/10;
			
		}
		if(temp==sum)
			return true;
		else
			
		return false;
		
	}
	public static void main(String[] args) {
		System.out.println(PalindromeNumber.checkpalindrome(95));
	}
}
