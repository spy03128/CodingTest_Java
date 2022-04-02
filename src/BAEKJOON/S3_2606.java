package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S3_2606 {
	static int list[][];
	static boolean visited[];
	static int N;
	static int result=0;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 N = sc.nextInt();
		 int line = sc.nextInt();
		 
		 list = new int[N+1][N+1];
		 visited = new boolean[N+1];
		 
		 for(int i=0;i<line;i++) {
			 int x = sc.nextInt();
			 int y = sc.nextInt();
			 
			 list[x][y] = 1;
			 list[y][x] = 1;
			 
		 }
		 
		 bfs(1);
		 
		 System.out.println(result);
	}
	private static void bfs(int i) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		visited[i] = true;
		queue.offer(i);
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			
			for(int j=1;j<=N;j++) {
				if(list[x][j]==1 && visited[j]==false) {
					queue.offer(j);
					visited[j] = true;
				}
			}
			
			
			
		}
		
		for(int j=2;j<=N;j++) {
			if(visited[j]==true) {
				result++;
			}
		}
		
		
	}
}
