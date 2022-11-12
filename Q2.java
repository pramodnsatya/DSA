// Max and min element in an array

import java.util.*;

public class Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
// Method-1 (For max only)		
		
		int start = 0;
		int end = n - 1;
		int c = 0;
		while (start < end) {
			if (arr[start] < arr[end]) {
				start++;
				c = arr[end];
			} else {
				end--;
				c = arr[start];
			}
		}
		System.out.println(c);
		
// Method-2 for both

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);

	}
}
