package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S4_1388 {
	static boolean visited[][];
	static String map[][];
	static int N,M;
	static int d[] = {-1,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 M = sc.nextInt();
		int cnt=0;
		sc.nextLine();
		map = new String[N][M];
		for(int i=0;i<N;i++) {
			String s = sc.nextLine();
			map[i] = s.split("");
		}
		
		visited = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {				
				if(!visited[i][j]) {
					cnt++;
					bfs(i,j);
				}
			}
		}
		
		
		System.out.println(cnt);
		
		
	}
	private static void bfs(int i, int j) {
		visited[i][j] = true;
		
		Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {i,j});
		
		while(!queue.isEmpty()) {
			int curr[] = queue.poll();
			int cx = curr[0];
			int cy = curr[1];
			
			if(map[cx][cy].equals("-")) {
				int nx =cx;
				for(int f=0;f<2;f++) {
					int ny = cy + d[f];
					if(ny>=0 && ny<M && !visited[nx][ny] && map[nx][ny].equals("-")) {
						queue.offer(new int [] {nx,ny});
						visited[nx][ny]  = true;
					}
					
				}
			}else {
				int ny =cy;
				for(int f=0;f<2;f++) {
					int nx = cx + d[f];
					if(nx>=0 && nx<N && !visited[nx][ny] && map[nx][ny].equals("|")) {
						queue.offer(new int [] {nx,ny});
						visited[nx][ny]  = true;
					}
				}
			}
			
			
			
			
		}
		
		
		
	}
}
