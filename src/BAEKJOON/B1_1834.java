package BAEKJOON;

import java.util.Scanner;

public class B1_1834 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();

		long ans = (num - 1) * (num + 1 + (num + 1) * (num - 1)) / 2;

		System.out.println(ans);

	}
}