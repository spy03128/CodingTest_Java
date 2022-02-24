package BAEKJOON;

import java.util.Scanner;

public class S3_15649 {
	static int N,M;
	static int [] arr;
	static boolean [] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		visited = new boolean[N];
		combi(0);
	}
	
	private static void combi(int cnt) {
		if(cnt==M) {
			for(int x=0;x<M;x++) {
			System.out.print(arr[x] +" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				arr[cnt] = i+1;
				visited[i] = true;
				combi(cnt+1);
				visited[i] =false;
				
			}
		}
		
		
	}

}
