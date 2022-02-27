package BAEKJOON;

import java.util.Scanner;

public class S3_15652 {
	static int N,M;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		combi(0,0);
	}
	private static void combi(int cnt, int start) {
		if(cnt == M) {
			for(int i=0;i<M;i++) {
			System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=start;i<N;i++) {
			arr[cnt] = i+1;
			combi(cnt+1,i);
		}
		
		
	}
}
