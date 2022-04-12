package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_14716 {
	static int map[][];
	static boolean visited[][];
	
	static int M,N;
	
	static int dx[] = {0,-1,-1,-1,0,1,1,1};
	static int dy[] = {-1,-1,0,1,1,1,0,-1};
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 M = sc.nextInt();
		 N = sc.nextInt();
		
		 map = new int[M][N];
		 visited = new boolean[M][N];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int cnt=0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]==1  && !visited[i][j]) {
					bfs(i,j);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
			}
	private static void bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		visited[i][j] = true;
		
		queue.offer(new int[] {i,j});
		
		while(!queue.isEmpty()) {
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			for(int d=0;d<8;d++) {
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				
				if(nx>=0 && ny>=0 && nx <M && ny <N 
						&& !visited[nx][ny] && map[nx][ny]==1) {
					
					visited[nx][ny] = true;
					queue.offer(new int[] {nx,ny});
				}
				
			}
			
			
		}
		
	}

	
}
