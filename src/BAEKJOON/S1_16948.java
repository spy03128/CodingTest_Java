package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_16948 {
	
	static int map [][] ;
	static boolean visited[][];
	static int dx[] = {-2,-2,0,2,2,0};
	static int dy[] = {-1,1,2,1,-1,-2};
	static int N;
	static int cnt=0;
	static int r1,c1,r2,c2;
	static boolean check  = false;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		
		map = new int[N][N];
		visited = new boolean[N][N];
		
		
		 r1 = sc.nextInt();
		 c1 = sc.nextInt();
		 r2 = sc.nextInt();
		 c2 = sc.nextInt();
		
		
		
		bfs(r1,c1);
		
		if(check) System.out.println(cnt);
		else System.out.println(-1);
	}

	private static void bfs(int r, int c) {
		
		Queue <int []> queue = new LinkedList<>();
		visited[r][c] = true;
		queue.offer(new int[] {r,c});
		
		
		while(!queue.isEmpty()) {
			
			if(visited[r2][c2]) {
				check = true;
				break;
			}
			
			int size = queue.size();
			
			for(int i=0;i<size;i++) {
				
				int current[] = queue.poll();
				int cx = current[0];
				int cy = current[1];
				
				
				for(int d=0;d<6;d++) {
					int nx = cx +dx[d];
					int ny = cy +dy[d];
					
					
					if(nx>=0 && ny>=0 && nx<N && ny <N
							&& !visited[nx][ny]) {
						
						queue.offer(new int[] {nx,ny});
						visited[nx][ny] = true;
						
						
						
					}
					
					
					
					
					
				}
				
				
				
			}
			
			cnt++;
		
			
			
		}
		
		
		
		
	}
}
