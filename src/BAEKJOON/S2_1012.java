package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S2_1012 {
	static int map[][];
	static boolean visited[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int x,y;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();

		for (int tc = 0; tc < TC; tc++) {
			 y = sc.nextInt();
			 x = sc.nextInt();

			map = new int[x][y];
			visited = new boolean[x][y];
			int k = sc.nextInt();

			for (int j = 0; j < k; j++) {
				int b = sc.nextInt();
				int a = sc.nextInt();

				map[a][b] = 1;

			}
			

			int cnt = 0;
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {

					if (map[i][j] == 1 && visited[i][j] == false) {
						bfs(i, j);
						cnt++;
					}
				}


			}
			System.out.println(cnt);

		}

	}

	private static void bfs(int i, int j) {
		
		Queue<int[]> queue = new LinkedList<>();
		
		visited[i][j] = true;
		
		queue.offer(new int[] {i,j});
		
		while(!queue.isEmpty()) {
			
			int current [] = queue.poll();
			
			for(int n=0;n<4;n++) {
				
				int newx = current[0] + dx[n];
				int newy = current[1] + dy[n];
				
				
				if(newx>=0 && newx<x && newy>=0 && newy<y && visited[newx][newy]== false && map[newx][newy]==1) {
					visited[newx][newy]= true;
					queue.offer(new int[] {newx,newy});
				}
				
			}
			
			
			
			
			
		}
		
		
	}
}
