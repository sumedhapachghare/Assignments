package Assignment14;

public class ass14 {

static void ass14(String perm,String word)
{
	if(word.isEmpty()) {
		System.out.println(perm+word);
	}
	else
	{
		for(int i=0;i<word.length();i++)
		{
			ass14(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));
		}
	}
	
	}
public static void ass14(String input) {
	ass14(" ",input);
}
public static void main(String[] args)
{
	ass14("ABCD");
}

}
