package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G3_14442 {
	static int N,M,K;
	static int map[][];
	static boolean visited[][][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		 N = sc.nextInt();
		 M = sc.nextInt();
		 K = sc.nextInt();
		map = new int[N][M];
		sc.nextLine();
		
		visited = new boolean[N][M][K+1];
		
		answer = -1;
		
		for(int i=0;i<N;i++) {
			String s = sc.nextLine();
			
			for(int j=0;j<M;j++) {
				map[i][j] = s.charAt(j) - '0';
			}
			
		}
		
		
		bfs();
		
		System.out.println(answer);
		
		
		
	}

	private static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {0,0,1,0});
		visited[0][0][0] = true;
		
		
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			int x = now[0];
			int y = now[1];
			if(x == N-1 && y == M-1) {
				answer = now[2];
				break;
			}
			
			
			
			for(int i=0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx<0 || ny<0 || nx>=N || ny>=M) {
					continue;
				}
				if(map[nx][ny]==0 && !visited[nx][ny][now[3]]) {
					queue.offer(new int[] {nx,ny,now[2]+1,now[3]});
					visited[nx][ny][now[3]] = true;
				}else {
					if(now[3]<K && !visited[nx][ny][now[3]+1]) {
						queue.offer(new int[] {nx,ny,now[2]+1,now[3]+1});
						visited[nx][ny][now[3]+1] = true;
					}
				}
				
				
				
				
				
			}
			
			
			
		}
		
		
		
	}
}
