package Q1HCFnumber;

public class HcfNumber {

public static int Number(int a,int b) {
	int hcf=0;
	for(int i=1;i<=a && i<=b;i++) {
		if(a % i ==0 && b % i == 0)
			hcf=i;

	}
	System.out.println(hcf);
	return hcf;

	}

public static void main(String[] args) {
	HcfNumber.Number(60, 75);
}
}
