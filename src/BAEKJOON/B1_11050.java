package BAEKJOON;

import java.util.Scanner;

public class B1_11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt();
		int K = sc.nextInt();
		
		int x = 1;
		for(int i=0;i<K;i++) {
			x *= N-i;
			
		}
		
		
		int y = 1;
		for(int i=0;i<K;i++) {
			y *= K - i;
			
		}
		
		System.out.println(x/y);
	}
}
