//Kth max and min element of an array

import java.util.*;
import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();

//Method-1

		Arrays.sort(arr);
		System.out.println("Kth min element : " + arr[k - 1]);
		System.out.println("Kth max element : " + arr[n - k]);

	}

}
