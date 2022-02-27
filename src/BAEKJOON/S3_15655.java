package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class S3_15655 {
	static int N,M;
	static int arr[],result[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N];
		result = new int[M];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		combi(0,0);
	}
	private static void combi(int cnt, int start) {
		if(cnt == M) {
			for(int i=0;i<M;i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=start;i<N;i++) {
			result[cnt] = arr[i];
			combi(cnt+1,i+1);
		}
	}
}
