package BAEKJOON;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class S1_2583 {
	static boolean visited[][];
	static int cnt=0;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int N,M;
	static int map[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 M = sc.nextInt();
		 N = sc.nextInt();
		int K = sc.nextInt();
		
		map = new int[M][N];
		visited = new boolean[M][N];
		List<Integer>list = new LinkedList<>();
		int num=0;
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0;i<K;i++) {
			int x1 =sc.nextInt();
			int y1 =sc.nextInt();
			int x2 =sc.nextInt();
			int y2 =sc.nextInt();
			
			for(int x=y1;x<y2;x++) {
				for(int y=x1;y<x2;y++) {
					map[x][y] = 1;
				}
			}
		}
		

		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]==0 &&!visited[i][j]) {
					cnt =0;
					bfs(i,j);
					num++;
					list.add(cnt);
				}
			}
			
		}
		
		sb.append(num).append("\n");
		int [] arr = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			arr[i]=list.get(i);
		}
		Arrays.sort(arr);
		for(int i=0;i<list.size();i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);
	}
	private static void bfs(int i, int j) {
		Queue<int[]>queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		visited[i][j] = true;
		
		while(!queue.isEmpty()) {
			cnt++;
			int curr [] = queue.poll();
			int cx = curr[0];
			int cy = curr[1];
			
			for(int d=0;d<4;d++) {
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				
				if(nx>=0 && ny>=0 && nx<M && ny<N 
						&& !visited[nx][ny] && map[nx][ny]==0) {
					visited[nx][ny] = true;
					queue.offer(new int[] {nx,ny});
					
					
				}
				
			}
			
			
			
			
		}
		
		
	}
}
