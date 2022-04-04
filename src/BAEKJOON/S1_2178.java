package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_2178 {
	static boolean visited[][] ;
	static int N,M;
	static int map[][];
	static int distance [][];
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map  = new int[N][M];
		visited = new boolean[N][M];
		distance = new int[N][M];
		sc.nextLine();
		
		for(int i=0;i<N;i++) {
			String s = sc.nextLine();
			for(int j=0;j<M;j++) {
				map[i][j] = s.charAt(j) - '0';
				
			}
		}
	
	
		bfs(0,0);
		
		System.out.println(distance[N-1][M-1]);
		
		
	}

	private static void bfs(int i, int j) {
		
		Queue<int[]> queue = new LinkedList<>();
		
		visited[i][j] = true;
		distance[i][j] = 1;
		boolean check = false;
		
		queue.offer(new int[] {i,j});
		
		while(!queue.isEmpty()) {
			
			int current[] =  queue.poll();
			int currentx = current[0];
			int currenty = current[1];
			
			
			for(int x=0;x<4;x++) {
				
				
				int newx = currentx + dx[x];
				int newy = currenty + dy[x];
			
				if(newx>=0 && newx<N && newy>=0 && newy<M && visited[newx][newy] == false && map[newx][newy]==1) {
					
					queue.offer(new int[] {newx,newy});
					visited[newx][newy]  = true;
					distance[newx][newy] = distance[currentx][currenty] +1;
				
					
					if(newx==N-1 && newy==M-1) {
						check = true;
						break;
					}
				}
					
				
			}
			
			if(check==true) {
				break;
			}
			
		}
		
	}

	
}
