package Q6Vowels;

public class Countingvowels {
public static int vowel(String a)
{

	int count=0;
	for(int i=0;i<a.length();i++)
	{
	if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
	{
	count++;	
	}
	}
	return count;
	
}
public static void main(String[] args) {
	System.out.println(Countingvowels.vowel("Sumedha"));
}
}
