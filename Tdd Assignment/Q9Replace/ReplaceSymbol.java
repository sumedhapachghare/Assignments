package Q9Replace;

public class ReplaceSymbol {
public static String check(String a) {
	String s=a.replaceAll("[@$-]","");
	return s;
	
}
public static void main(String[] args) {
	System.out.println(ReplaceSymbol.check("This @ Red $car-."));
}
}
