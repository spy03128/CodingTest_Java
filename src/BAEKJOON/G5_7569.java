package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G5_7569 {
	static int dx[] = {0,0,0,0,1,-1};
	static int dy[] = {0,0,-1,1,0,0};
	static int dz[] = {1,-1,0,0,0,0};
	
	static Queue<int[]> queue = new LinkedList<>();
	
	static boolean visited[][][];
	static int map[][][];
	
	
	static int day=-1;
	static int M,N,H;
	
	static boolean not = false;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 M = sc.nextInt(); //가로칸수
		 N = sc.nextInt(); //세로칸수
		 H = sc.nextInt(); //높이 수
		
		map = new int[H][N][M];
		
		visited = new boolean[H][N][M];
		int numT = 0;
		
		for(int a =0 ; a<H;a++) {
			for(int b=0;b<N;b++) {
				for(int c = 0; c<M;c++) {
					
					map[a][b][c] = sc.nextInt();
					if(map[a][b][c]==1) queue.offer(new int[] {a,b,c});
					else if(map[a][b][c]==0) numT++;
				}
			}
		}

	
		
		
		
		if(numT==0) System.out.println(0);
		else {
			
			bfs();
			
			
			
			
			for(int a =0 ; a<H;a++) {
				for(int b=0;b<N;b++) {
					for(int c = 0; c<M;c++) {
					
			
						if(map[a][b][c]==0) not = true;
					}
				
				}
		
			}
	
			
			
			if(!not) System.out.println(day);
			else System.out.println(-1);
			
			
			
		}
		
		
		
		
		
	}

	private static void bfs() {
		
		boolean check = false;
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			
			for(int i=0;i<size;i++) {
				int current [] = queue.poll();
				
				int ca = current[0];
				int cb = current[1];
				int cc = current[2];
				
				
			
				for(int d=0;d<6;d++) {
					
					int na = ca + dz[d];
					int nb = cb + dx[d];
					int nc = cc + dy[d];
					
					if(na>=0 && nb >=0 && nc>=0 && na<H && nb<N && nc<M
							&& !visited[na][nb][nc] && map[na][nb][nc]==0) {
						check = true;
						visited[na][nb][nc] = true;
						map[na][nb][nc]=1;
						queue.offer(new int[] {na,nb,nc});
						
						
					}
					
					
					
				}
				
			
				
				
				
			}
			
			day++;
			
			
			
			
			
			
			
			
			
		}
		if(!check) not = true;
		
		
		
		
		
	}
}
