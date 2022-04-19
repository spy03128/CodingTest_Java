package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_7562 {

	static int map[][];
	static boolean visited[][];
	static int cnt;
	static int dx[] = {-1,-2,-2,-1,1,2,2,1};
	static int dy[] = {-2,-1,1,2,2,1,-1,-2};
	static int l;
	static int ex,ey;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i=0;i<tc;i++) {
			
			
			l = sc.nextInt(); //한변의 길이
			
			map = new int[l][l];
			visited = new boolean[l][l];
			cnt =1;
			
			//현재 위치
			int cx = sc.nextInt(); 
			int cy = sc.nextInt();
			
			//가려고 하는 위치
			ex = sc.nextInt();
			ey = sc.nextInt();
			
			
			
			
			
			if(cx==ex && cy==ey) System.out.println(0);
			else {
				bfs(cx,cy);
				
				System.out.println(cnt);
			}
			
		}
		
		
		
		
	}

	private static void bfs(int x, int y) {
		visited[x][y] = true;
		
		Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {x,y});
		
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			
			for(int i=0;i<size;i++) {
				
				
				int current [] = queue.poll();
				int cx = current[0];
				int cy = current[1];
				
				
				
				for(int d=0;d<8;d++) {
					
					int nx = cx + dx[d];
					int ny = cy + dy[d];
					
					if(nx>=0 && ny>=0 && nx<l && ny<l
							&&!visited[nx][ny]) {
						
						queue.offer(new int[] {nx,ny});
						visited[nx][ny] = true;
						if(visited[ex][ey]) return;
					}
					
					
				}
				
				
				
				
			}
			cnt++;
			
			
			
			
			
			
			
		}
		
		
		
	}
}
