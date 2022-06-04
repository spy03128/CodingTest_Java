package BAEKJOON;

import java.util.Scanner;

public class S3_11659 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		

		int sum[] = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			sum[i] = sum[i-1]+ sc.nextInt();
		}

	
		
		for(int i=0;i<M;i++) {
			int st = sc.nextInt();
			int end = sc.nextInt();
			
			sb.append(sum[end]-sum[st-1]).append("\n");
		}
		
		System.out.println(sb);
	}
}
