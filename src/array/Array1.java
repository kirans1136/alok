package array;

import java.util.Scanner;

public class Array1 {
	static int array(int[]arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		  sum=sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array index number");
		int size=sc.nextInt();	
		int[]arr=new int[size];
		System.out.println("enter the array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int x=array(arr);
	 System.out.println(x);
	}
}



