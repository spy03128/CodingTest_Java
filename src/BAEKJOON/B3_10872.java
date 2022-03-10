package BAEKJOON;

import java.util.Scanner;

public class B3_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(recur(N));
	}

	private static int recur(int n) {
		if(n==0) {
			return 1;
		}
		return n * recur(n-1);
		
	}
}
