package Assignment13;

public class Ass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,7,4,98,5,6,3,8,67,2,3};
for(int i=0;i<arr.length;i++)
{
	if(i<=4)
	{
		String s=arr[i]+"-"+(arr[i+2]);
		System.out.println(s+",");
		i=i+2;
	}
	else if(i<=10)
	{
		String s=arr[i]+"-"+(arr[i+4]);
		System.out.println(s+",");
		i=i+4;
	}
	else {
		String s=arr[i]+"-"+(arr[i+3]);
		System.out.println(s+" ");
		i=i+3;
	}
}
	}

}
