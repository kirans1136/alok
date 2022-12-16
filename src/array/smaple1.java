package array;

import java.util.Scanner;

public class smaple1 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		int size = s1.nextInt();
		int[] arr = new int[size];
		

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s1.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int no = arr[i];
			int sum = 0;
			while (no != 0) {
				int rem = no % 10;
				sum = sum + rem;
				no = no / 10;

			}
			System.out.println(sum + " ");

		}
	}
}
