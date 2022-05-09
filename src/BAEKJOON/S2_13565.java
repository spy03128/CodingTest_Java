package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S2_13565 {
	static Queue<int[]> queue = new LinkedList<>();
	static int M, N;
	static String map[][];
	static boolean visited[][];
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
		N = sc.nextInt();
		sc.nextLine();
		map = new String[M][N];
		visited = new boolean[M][N];

		for (int i = 0; i < M; i++) {

			String s = sc.nextLine();
			map[i] = s.split("");
		}

		for (int i = 0; i < N; i++) {
			if (map[0][i].equals("0")) {
				queue.offer(new int[] { 0, i });
				visited[0][i] = true;
			}
		}

		bfs();
		
		
		boolean check = false;
		for (int i = 0; i < N; i++) {
			if(map[M-1][i].equals("0")) {
				
				if (visited[M-1][i]) {
					check=true;
					break;
				}
			}
		}
		
		if(check) System.out.println("YES");
		else System.out.println("NO");
		

	}

	private static void bfs() {
		
		while(!queue.isEmpty()) {
			int curr[] = queue.poll();
			int cx = curr[0];
			int cy = curr[1];
			
			
			for(int d=0;d<4;d++) {
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				
				if(nx>=0 && ny>=0 && nx<M && ny<N
						&& !visited[nx][ny] && map[nx][ny].equals("0")) {
					queue.offer(new int[] {nx,ny});
					visited[nx][ny] = true;
					
					
					
				}
				
				
				
			}
			
			
			
		}
		
		

	}
}
