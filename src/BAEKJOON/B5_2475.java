package BAEKJOON;

import java.util.Scanner;

public class B5_2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++) {
			int x = sc.nextInt();
			sum += (x*x);
		}
		System.out.println(sum%10);
	}
}
