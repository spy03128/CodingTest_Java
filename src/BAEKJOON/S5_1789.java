package BAEKJOON;

import java.util.Scanner;

public class S5_1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long S = sc.nextLong();
		long sum = 0;
		int result = 0;
		for (long i = 1; i <= S; i++) {
			if(S==1) result=1;
			sum += i;
			if (sum > S) {
				sum = sum - i;

				result = (int) i - 1;

				break;
			}
		}

		System.out.println(result);

	}
}
