package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

public class S2_11724 {
	static boolean visited[];
	static ArrayList<Integer> array [];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		array = new ArrayList[N+1]; 
		visited = new boolean[N+1];
				
		for(int i=1;i<=N;i++) {
			array[i] = new ArrayList<Integer>();
			
		}
		
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			array[a].add(b);
			array[b].add(a);

		}
		
		int count =0;
		
		for(int i=1;i<=N;i++) {
			if(!visited[i]) {
				DFS(i);
				count++;
			}
		}
		
		System.out.println(count);
		
	}

	private static void DFS(int i) {
		if(visited[i]) return;
		
		visited[i] = true;
		for(int x:array[i]) {
			if(x==i) continue;
			DFS(x);
		}
		
	}
}
