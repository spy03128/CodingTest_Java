package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G5_6593 {
	static int dx[] = {-1,1,0,0,0,0};
	static int dy[] = {0,0,-1,1,0,0};
	static int dz[] = {0,0,0,0,-1,1};
	static boolean visited[][][];
	static String map[][][];
	static int L,R,C;
	static boolean check;
	static int num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			 L = sc.nextInt();
			 R = sc.nextInt();
			 C = sc.nextInt();
			sc.nextLine();
			check = false;
			num=0;
			if(L==0 && R==0 && C==0) break;
			
			map = new String[L][R][C];
			visited = new boolean[L][R][C];
			for (int i = 0; i < L; i++) {
				String temp[][] = new String[R][C];

				for (int j = 0; j < R; j++) {
					temp[j] = sc.nextLine().split("");
					
				}

				map[i] = temp;
				sc.nextLine();

			}
			
			
			
	
			
			
			ck : for(int i=0;i<L;i++) {
				for(int j=0;j<R;j++) {
					for(int k=0;k<C;k++) {
						if(map[i][j][k].equals("S")) {
					
							bfs(i,j,k);
							break ck;
						}
								
					}
				}
			}
			if(!check) System.out.println("Trapped!");
			else System.out.println("Escaped in "+(num+1)+" minute(s).");
			
		
		}

	}

	private static void bfs(int i, int j, int k) {
		Queue<int[]> queue = new LinkedList<>();
		visited[i][j][k] = true;
		queue.offer(new int[] {i,j,k});
		
		
		wh: while(!queue.isEmpty()) {
			int qz = queue.size();
			
			for(int q=0;q<qz;q++) {
				
				int current[] = queue.poll();
		
				
				for(int x=0;x<6;x++) {
					int nz = current[0] +dz[x];
					int nx = current[1] +dx[x];
					int ny = current[2] +dy[x];
					if(nx>=0 && ny>=0 && nz>=0 && nz<L && nx<R && ny<C
							&& !visited[nz][nx][ny] ) {
						if( map[nz][nx][ny].equals(".")) {
							
							queue.offer(new int[] {nz,nx,ny});
							visited[nz][nx][ny] =true;
						}else if( map[nz][nx][ny].equals("E")) {
							if(visited[current[0]][current[1]][current[2]]) {
								
								System.out.println("들어옴");
								check = true;
								break wh;
							}
						}
						
						
					}
					
				}
				
			}
			num++;
			
			
			
		}
		
		
	}
}
