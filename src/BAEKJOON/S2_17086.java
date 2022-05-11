package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S2_17086 {
	static boolean visited[][];
	static int map[][];
	static int dx[] = {-1,-1,0,1,1,1,0,-1};
	static int dy[] = {0,1,1,1,0,-1,-1,-1};
	static int N,M;
	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 M = sc.nextInt();
		 int max=0;
		
		 map = new int[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				cnt =0;
				visited = new boolean[N][M];
				if(map[i][j]==0)bfs(i,j);
				if(cnt>max) max=cnt;
			}
		}
		
		System.out.println(max);
		
	}
	private static void bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		visited[i][j] = true;
		queue.offer(new int[] {i,j});
		
		while(!queue.isEmpty()) {
			
			int qs = queue.size();
			
			for(int q=0;q<qs;q++) {
				int curr [] = queue.poll();
				int cx = curr[0];
				int cy = curr[1];
				
				for(int d=0;d<8;d++) {
					int nx = cx+dx[d];
					int ny = cy+dy[d];
					
					if(nx>=0 && ny>=0 && nx<N && ny<M
							&& !visited[nx][ny] ) {
						if(map[nx][ny]==1) {
							cnt++;
							return;
						}
						
						queue.offer(new int[] {nx,ny});
						visited[nx][ny] = true;
						
					}
					
					
					
				}
				
			}
			
			cnt++;
			
			
		}
		
		
		
	}
}
