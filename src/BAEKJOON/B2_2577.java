package BAEKJOON;

import java.util.Scanner;

public class B2_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C =	sc.nextInt();
		
		String result = (A*B*C)+"";
		
		
		int num[] = new int[10];
		
		for(int i=0;i<result.length();i++) {
			num[result.charAt(i)-'0']++;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(num[i]);
		}
	}
}
