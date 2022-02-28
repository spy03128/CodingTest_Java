package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class S3_15656 {
	static int N,M;
	static int[] arr,result;

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr= new int[N];
		for(int i=0;i<N;i++) {
			arr[i]  = sc.nextInt();
		}
		result = new int[M];
		Arrays.sort(arr);
		permu(0);
		System.out.println(sb);
		
	}
	private static void permu(int cnt) {
		if(cnt == M) {
			for(int i=0;i<M;i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		
		for(int i=0;i<N;i++) {
			result[cnt] = arr[i];
			permu(cnt+1);
		}
		
	}
}
