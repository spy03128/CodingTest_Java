package BAEKJOON;

import java.util.Scanner;

public class S3_10974 {
	static int N;
	static int[] arr,result;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr= new int[N];
		result = new int[N];
		visited = new boolean[N];
		for(int i=0;i<N;i++) {
			arr[i] =i+1;
		}
		
		permu(0);
	}
	private static void permu(int cnt) {
		if(cnt == N) {
			for(int i=0;i<N;i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				visited[i] = true;
				result[cnt] = arr[i];
				permu(cnt+1);
				visited[i] = false;
			}
		}
		
	}
}
