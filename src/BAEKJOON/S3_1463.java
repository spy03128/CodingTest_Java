package BAEKJOON;

import java.util.Scanner;

public class S3_1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int[] arr = new int[n + 3];

		arr[1] = 0;
		arr[2] = 1;
		arr[3] = 1;

		if (n >= 4) {
			for (int i = 4; i <= n; i++) {
				int min = Integer.MAX_VALUE;
				if (i % 3 == 0) {
					if (1 + arr[i / 3] < min)
						min = 1 + arr[i / 3];
				}
				if (i % 2 == 0) {
					if (1 + arr[i / 2] < min)
						min = 1 + arr[i / 2];
				}
				if (1 + arr[i - 1] < min) {
					min = 1 + arr[i - 1];
				}

				arr[i] = min;
			}
		}

		System.out.println(arr[n]);
	}

}
