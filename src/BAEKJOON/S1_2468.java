package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_2468 {
	static boolean visited[][];
	static int map[][];
	static int N;
	static int maxcnt=0;
	
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		map = new int[N][N];
		int max=0;
		int min=100;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j]>max) max= map[i][j];
			
			}
		}
		
	
		for(int f=0;f<max;f++) {
			visited = new boolean[N][N];
			int cnt = 0;
			
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(!visited[i][j] && map[i][j]>f) {
						bfs(i,j,f);
						cnt++;
					}
				}
			}
			
			
			if(cnt > maxcnt) maxcnt = cnt;
			
			
		}
		
		System.out.println(maxcnt);
		
		
	}
	private static void bfs(int i, int j, int f) {
		
		visited[i][j] = true;
		Queue<int []> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		
		while(!queue.isEmpty()) {
			
			int current [] = queue.poll();
			
			int cx = current[0];
			int cy = current[1];
			
			for(int d=0;d<4;d++) {
				
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				
				if(nx>=0 && ny>=0 && nx<N && ny<N
						&& !visited[nx][ny] && map[nx][ny]>f) {
					
					visited[nx][ny] = true;
					queue.offer(new int[] {nx,ny});
				}
				
				
				
				
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}
}
