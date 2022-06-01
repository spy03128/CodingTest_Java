package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G4_2573 {
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static boolean visited[][];
	static int N,M;
	static int map[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		 N = sc.nextInt();
		 M = sc.nextInt();
		
		map = new int[N][M];
		int num[][] = new int[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int answer = 0;
		
		nuch : while(true) {
			answer++;
			
			int sum=0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(map[i][j] != 0) {
						int number = 0;
						for(int d=0;d<4;d++) {
							int nx = i + dx[d];
							int ny = j + dy[d];
							
							if(nx>=0 && ny>=0 && nx<N && ny<M) {
								if(map[nx][ny]==0) number++;
							}
							
						}
						
						num[i][j] = number;
					}
					sum+=map[i][j];
				}
			}
			if(sum==0) {
				answer=0;
				break nuch;
			}
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					int result = map[i][j] - num[i][j];
					if(result<0) result =0;
					map[i][j] = result;
				}
			}
			
		
			
			
			visited = new boolean[N][M];
			int check=0;
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					
					if(map[i][j]!=0 && !visited[i][j]) {
						
						bfs(i,j);
						check++;
						if(check==2) break nuch;
					}
				}
			}
		}
		
		System.out.println(answer);
		
		
	}
	private static void bfs(int i, int j) {
		Queue<int []> queue = new LinkedList<>();
		visited[i][j] =true;
		queue.offer(new int[] {i,j});
		
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			
			for(int d=0;d<4;d++) {
				int nx = now[0] + dx[d];
				int ny = now[1] + dy[d];
				
				
				if(nx>=0 && ny>=0 && nx<N && ny<M 
						&& map[nx][ny]!=0 && !visited[nx][ny]) {
					queue.offer(new int[] {nx,ny});
					visited[nx][ny] = true;
				}
				
			}
			
			
			
		}
		
		
	}
}
