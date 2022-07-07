package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G3_1941 {
	static int result[];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int cnt=0;
	static String map[][];
	static boolean visited[][];
	static int num=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		map = new String[5][5];
		
		for(int i=0;i<5;i++) {
			String s = sc.nextLine();
			map[i] = s.split("");
		}
		result = new int[7];
		
		combi(0, 0, 0);
		
		System.out.println(cnt);
		
		
	}
	private static void combi(int cnt, int start, int ynum) {
		if(ynum>3) return;
		if(cnt==7) {

			check();
			return;
		}
		for(int i=start;i<25;i++) {
			result[cnt] = i;
			if(map[i/5][i%5].equals("Y")) {
				
				combi(cnt+1,i+1,ynum+1);
			}else {
				combi(cnt+1,i+1,ynum);
			}
		}
		
	}
	private static void check() {
	
		int temp[][] = new int[5][5];
		
		
		for(int i=0;i<7;i++) {
			int x = result[i];
			temp[x/5][x%5]=1;
		}
		visited = new boolean[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(temp[i][j]==1) {
					num=0;
					BFS(i,j,temp);
					if(num==7) {
						cnt++;
						return;
					}
				}
			}
		}
		
		
	}
	private static void BFS(int i, int j, int temp[][]) {
		Queue<int []> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		visited[i][j] = true;
		
		while(!queue.isEmpty()) {
			int cur [] = queue.poll();
			num++;
			
			int cx = cur[0];
			int cy = cur[1];
			
			for(int d=0;d<4;d++) {
				int nx = cx + dx[d];
				int ny = cy + dy[d];
				
				
				if(nx>=0 && ny>=0 && nx<5 && ny<5 
						&& !visited[nx][ny] && temp[nx][ny]==1) {
					visited[nx][ny] = true;
					queue.offer(new int[] {nx,ny});
				}
				
			}
			
			
		}
	}

}
