package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class S3_15654 {
	static int N,M;
	static int[] arr, result;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr= new int[N];
		for(int i=0; i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		result = new int[M];
		visited = new boolean[N];
		permu(0);
		
		
	}
	private static void permu(int cnt) {
		if(cnt == M) {
			for(int i=0;i<M;i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++) {
			
			if(visited[i] == true) continue;
			
			visited[i] = true;
			result[cnt] = arr[i];
			permu(cnt+1);
			visited[i] = false;
			
		}
	}
}
