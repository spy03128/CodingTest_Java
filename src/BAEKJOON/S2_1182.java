package BAEKJOON;

import java.util.Scanner;

public class S2_1182 {
	static int N,M;
	static int[] arr;
	static int num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr= new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		combi(0,0,0);
		System.out.println(num);
	}
	private static void combi(int cnt, int start,int sum) {
		if(sum==M && cnt>=1) {
			num++;
		
		}
		if(cnt == N) {
			return;
		}
		
		for(int i=start;i<N;i++) {
			
			combi(cnt+1,i+1,sum+arr[i]);
		}
		
	}
}
