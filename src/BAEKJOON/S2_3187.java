package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S2_3187 {
	static int R,C;
	static int v=0,k=0;
	static boolean visited[][];
	static String map[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 R = sc.nextInt();
		 C = sc.nextInt();
		
		sc.nextLine();
		
		map = new String[R][C];
		
		for(int i=0;i<R;i++) {
			String s = sc.nextLine();
			map[i] = s.split("");
		}
		visited = new boolean[R][C];
		
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(map[i][j].equals("v")) v++;
				else if(map[i][j].equals("k")) k++;
				
				if(!map[i][j].equals("#") && !visited[i][j]) {
					bfs(i,j);
				}
			}
		}
		
		
		System.out.println(k+" "+v);
		
	}

	private static void bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		
		visited[i][j] = true;
		
		queue.offer(new int[] {i,j});
		
		int vn = 0;
		int kn = 0;
		
		
		while(!queue.isEmpty()) {
			int curr [] = queue.poll();
			
			int cx = curr[0];
			int cy = curr[1];
			
			if(map[cx][cy].equals("k")) kn++;
			else if(map[cx][cy].equals("v")) vn++;
			
			for(int d=0;d<4;d++) {
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				
				if(nx>=0 && ny>=0 && nx<R && ny<C
						&& !visited[nx][ny] && !map[nx][ny].equals("#")) {
					
					queue.offer(new int[] {nx,ny});
					visited[nx][ny] = true;
					
					
					
				}
				
				
				
			}
			
			
		}
	
		if(kn>vn) {
			v = v-vn;
		}else {
			k = k-kn;
		}
		
		
		
	}
}
