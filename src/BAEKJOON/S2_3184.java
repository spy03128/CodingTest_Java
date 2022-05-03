package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S2_3184 {
	static int R,C;
	static String[][] map;
	static boolean visited[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int v=0,o=0;
	static int vnum,onum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 R = sc.nextInt();
		 C = sc.nextInt();
		sc.nextLine();
		map = new String[R][C];
		visited = new boolean[R][C];
		
		for(int i=0;i<R;i++) {
			String s = sc.nextLine();
			map[i] = s.split("");
		}
		
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(map[i][j].equals("o")) {
					o++;
				}else if(map[i][j].equals("v")) {
					v++;
				}
				
				if(!map[i][j].equals("#") && !visited[i][j]) {
					bfs(i,j);
				}
			}
		}
		
		System.out.println(o+" "+v);
		
	}

	private static void bfs(int i, int j) {
		visited[i][j] = true;
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		 vnum=0;
		 onum=0;
		
		while(!queue.isEmpty()) {
			
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			if(map[cx][cy].equals("o")) {
				onum++;
			}else if(map[cx][cy].equals("v")) {
				vnum++;
			}
			
			for(int d=0;d<4;d++) {
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				if(nx>=0 && ny>=0 && nx<R && ny<C
						&& !map[nx][ny].equals("#") && !visited[nx][ny]) {
					
					visited[nx][ny] = true;
					queue.offer(new int[] {nx,ny});
					

				}
				

			}

		}
	
		if(onum>vnum) {
			v=v-vnum;
		}else {
			o=o-onum;
		}
		
		
		
		
		
		
	}
}
