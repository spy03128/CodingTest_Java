package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S2_4963 {
	static boolean visited[][];
	static int map[][];
	
	static int dx[] = {0,-1,-1,-1,0,1,1,1};
	static int dy[] = {-1,-1,0,1,1,1,0,-1};
	
	static int w,h;
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		while(true) {
			 w = sc.nextInt();
			 h = sc.nextInt();
			
			if(w==0 && h==0) break;
			
			map = new int[h][w];
			visited = new boolean[h][w];
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int cnt =0;
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(!visited[i][j] && map[i][j] == 1 ) {
						bfs(i,j);
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
			
		}
	}

	private static void bfs(int i, int j) {
		Queue<int []> queue = new LinkedList<>();
		visited[i][j] = true;
		
		queue.offer(new int[] {i,j});
		
		while(!queue.isEmpty()) {
			
			int current [] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			for(int d=0;d<8;d++) {
				
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				if(nx>=0 && ny>=0 && nx <h && ny<w
						&& !visited[nx][ny] && map[nx][ny]==1) {
					queue.offer(new int[] {nx,ny});
					visited[nx][ny] = true;
					
				} 
				
			}
			
			
		}
		
		
	}
}
