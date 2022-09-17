package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class B2_1773 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int c = scan.nextInt();

		boolean[] boom = new boolean[c + 1];
		Arrays.fill(boom, false);

		for (int i = 0; i < n; i++) {
			int period = scan.nextInt();
			for (int j = 1; j <= c / period; j++) {
				boom[j * period] = true;
			}
		}

		int cnt = 0;
		for (int i = 1; i <= c; i++) {
			if (boom[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
