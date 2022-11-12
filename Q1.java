//Program to reverse an array.

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
// Method-1

		for (int j = n - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}

// Method-2

		int temp;
		int start = 0;
		int end = n - 1;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
