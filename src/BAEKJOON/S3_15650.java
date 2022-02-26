package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class S3_15650 {
	static int N,M;
	static int[] arr;
	static boolean [] visited;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		visited = new boolean[N];
		
		combi(0,0);
		
	}

	private static void combi(int cnt, int start) {
		if(cnt==M) {
//			Arrays.sort(arr);
			for(int i=0;i<M;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			return;
		}
		
		for(int i=start;i<N;i++) {
			arr[cnt] = i+1;

			combi(cnt+1,i+1);

		}
		
		
		
	}
	
	
}
