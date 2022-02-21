package BAEKJOON;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_1260 {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		int map[][] = new int[N][N];
		
		for(int i=0;i<M;i++) {
			int from = sc.nextInt()-1;
			int to = sc.nextInt()-1;
			
			map[from][to] = 1;
			map[to][from] = 1;
			
		}
		

		dfs(map,new boolean[N],V-1);
		System.out.println();
		bfs(map,V-1);
		
	}

	public static void bfs(int[][] adjMatrix,int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] visited = new boolean[N];
		
		queue.offer(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			System.out.print((current+1)+" ");
			
			
			//current 정점의 인접 정점을 처리 단, 방문하지않은 인접정점만
			
			for (int i = 0; i < N; i++) {
				if(!visited[i] && adjMatrix[current][i]!=0) {
					queue.offer(i);
					visited[i]=true;
				} 
				
			}
			
		}
	}
	
	
	
	public static void dfs(int[][] adjMatrix, boolean[] visited, int current) {
		
		visited[current] = true;
		System.out.print((current+1)+" ");
		
		//current 정점의 인접 정점을 처리 단, 방문하지않은 인접정점만
		
		for (int i = 0; i < N; i++) {
			if(!visited[i] && adjMatrix[current][i]!=0) {
				dfs(adjMatrix,visited,i);
			} 
			
		}
	}
}
