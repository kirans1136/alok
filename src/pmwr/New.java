package pmwr;

import java.util.Scanner;

public class New {
	static void array(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args, int[][] nextInt) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array index number");
		int size=sc.nextInt();
		int[]arr=nextInt[size];
		System.out.println("enter the array element");
	}
}
