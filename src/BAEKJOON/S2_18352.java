package BAEKJOON;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S2_18352 {
	static int[] visited;
	static int X;
	static ArrayList<Integer>[] list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		X = sc.nextInt();
		
		list = new ArrayList[N+1];
		
		for(int i=0;i<=N;i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list[a].add(b);
		}
		
		visited = new int[N+1];
		for(int i=0;i<=N;i++) {
			visited[i] = -1;
		}
		BFS(X);
		
		for(int i=0;i<=N;i++) {
			if(visited[i]==K) sb.append(i).append("\n");
		}
		if(sb.length()==0) System.out.println(-1);
		else System.out.println(sb);
		
	}

	private static void BFS(int x) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(X);
		visited[X] = 0;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			
			for(int i : list[current]) {
				if(visited[i]==-1) {
					queue.add(i);
					visited[i] = visited[current]+1;
				}
				
			}
			
			
			
			
		}
		
		
		
	}
}
