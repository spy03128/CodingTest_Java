package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_1743 {
	static boolean visited[][];
	static int map[][];
	static int cnt;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int N,M;
	static int max=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 M = sc.nextInt();
		
		int K = sc.nextInt();
		
		map = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		
		for(int i=0;i<K;i++) {
			
			int r = sc.nextInt();
			int c = sc.nextInt();
			
			
			map[r][c] = 1;
			
			
			
		}
		
		
		

		
		
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {

				if(!visited[i][j] && map[i][j]==1) {
					cnt=0;
					bfs(i,j);
				}
				
			}
			
			
			
		}
		

		
		System.out.println(max);
		
		
		
		
	}
	private static void bfs(int i, int j) {
		visited[i][j] = true;
		Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {i,j});
		
		
		while(!queue.isEmpty()) {
			
			int current [] = queue.poll();
			
			int cx = current[0];
			int cy = current[1];
			cnt++;
			
			for(int d=0;d<4;d++) {
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				
				if(nx>=0 && ny>=0 && nx<=N && ny<=M
						&& !visited[nx][ny] && map[nx][ny]==1) {
					
					visited[nx][ny] = true;
					queue.offer(new int[] {nx,ny});
					
				}
					
				
				
				
			}
			
			
			
		}
		
		if(cnt>max) max=cnt;
		
		
	}
}
