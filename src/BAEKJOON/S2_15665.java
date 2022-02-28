package BAEKJOON;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class S2_15665 {
	static int N,M;
	static int arr[],result[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N];
		result = new int[M];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		 Arrays.sort(arr);
		
		permu(0);
		
		System.out.println(sb);
		
	}
	private static void permu(int cnt) {

		if(cnt==M) {
			for(int i=0;i<M;i++) {
				sb.append(result[i]).append(" ");
			}
			
			sb.append("\n");
			
			return;
		}
		
		int x=0;
		for(int i=0;i<N;i++) {
			if(x==arr[i]) continue;
			result[cnt] = arr[i];
			x = arr[i];
			permu(cnt+1);
		}
	}
}
