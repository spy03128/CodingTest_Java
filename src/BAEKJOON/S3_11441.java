package BAEKJOON;

import java.util.Scanner;

public class S3_11441 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int num[] = new int[N];
		int sumarr[] = new int[N];
		for(int i=0; i<N;i++) {
			num[i] = sc.nextInt();
			if(i>=1) {
			sumarr[i] = sumarr[i-1]+ num[i];
			}else if(i==0) {
				sumarr[i] = num[i];
			}
		}
		
	

		int M = sc.nextInt();
		
		for(int i=0;i<M;i++) {
			
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			int sum = 0;
			if(start ==1) {
				sum = sumarr[end-1];
			}else {
				
				sum = sumarr[end-1] - sumarr[start-2];
			}
			
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
}
