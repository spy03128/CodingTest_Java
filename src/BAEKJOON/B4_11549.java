package BAEKJOON;

import java.util.Scanner;

public class B4_11549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < 5; i++) {
			if (sc.nextInt() == t)
				ans += 1;
		}
		System.out.println(ans);
	}
}