package Assignment15;

public class ass15 {

static boolean isTriplet(int arr[],int n)
{
	for(int i=0;i<n;i++)
	{
		for(int v=i+1;v<n;v++)
		{
			for(int k=v+1;k<n;k++)
			{
				int x=arr[i]*arr[i],y=arr[v]*arr[v],z=arr[k]*arr[k];
			}
		}
}
	return false;
	}
public static void main(String[] args)
{
	int arr[]= {1,2,6,7,45};
	int arr_size=arr.length;
	if(isTriplet(arr,arr_size)==true)
	{
		System.out.println("true");
	}
		else
		{
			System.out.println("false");
	}
}
}
