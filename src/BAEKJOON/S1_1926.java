package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_1926 {
	static int draw[][];
	static boolean visited[][] ;
	static int dx [] = {-1,1,0,0};
	static int dy [] = {0,0,-1,1};
	static int n,m;
	static int max=0;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 n = sc.nextInt();
		 m = sc.nextInt();
		 int num=0;
		
		
		draw = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				draw[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(draw[i][j]==1 && visited[i][j]==false) {
					bfs(i,j);
					num++;
				}
			}
		}
		
		System.out.println(num);
		System.out.println(max);
		
		
		
	}


	private static void bfs(int i, int j) {
		// TODO Auto-generated method stub
		
		Queue<int[]> queue = new LinkedList<>();
		
		int cnt = 1;
		visited[i][j] = true;
		queue.offer(new int[] {i,j});
		
		while(!queue.isEmpty()) {
			
			int [] current = queue.poll();
			int currentx = current[0];
			int currenty = current[1];
			
			for(int d=0;d<4;d++) {
				int nx = currentx + dx[d];
				int ny = currenty + dy[d];
				
				if(nx>=0 && ny>=0 & nx <n && ny<m && draw[nx][ny]==1 && !visited[nx][ny]) {
					queue.offer(new int[] {nx,ny});
					visited[nx][ny] = true;
					cnt++;
				}
				
				
			}
			
		}
		
		
		if(cnt>max) max = cnt;
		
		
	}
}
