package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class S2_15666 {
	
	static int N,M;
	static int arr[], result[];
	static StringBuilder sb = new StringBuilder();
	
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
		System.out.println(sb);
		
	}

	private static void combi(int cnt, int start) {

		if(cnt == M) {
			for(int i=0;i<M;i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		int x=0;
		for(int i=start;i<N;i++) {
			if(x==arr[i]) continue;
			result[cnt] = arr[i];
			x=arr[i];
			combi(cnt+1,i);
		}
		
	}
	
	
}
