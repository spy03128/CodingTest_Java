package BAEKJOON;

import java.util.Scanner;

public class B3_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int min=Integer.MAX_VALUE;
		int max=-1000000;
		for(int i=0;i<N;i++) {
			int x = sc.nextInt();
			if(x>=max) max=x;
			if(x<min) min=x;
		}
		
		
		System.out.printf("%d %d", min, max);
	}
}
