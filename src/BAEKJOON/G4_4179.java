package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G4_4179 {
	static int firemap[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int r,c;
	static char map[][];
	static int visited[][];
	static Queue<int[]> firequeue = new LinkedList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		 r = sc.nextInt();
		 c = sc.nextInt();
		
		int Fr = 0;
		
		int Fc = 0;
		
		int JHr = 0;
		int JHc = 0;
		
		
		sc.nextLine();
		
		map = new char[r][c];
		visited = new int[r][c];
		firemap = new int[r][c];
		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				firemap[i][j] = Integer.MAX_VALUE;
				visited[i][j] = -1;
			}
		}
	
		for(int i=0;i<r;i++) {
			String s = sc.nextLine();
			for(int j=0;j<c;j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j]=='F') {
					firequeue.offer(new int[] {i,j});
					firemap[i][j] = 0;
				}else if(map[i][j]=='J') {
					JHr = i;
					JHc = j;
				}
			}
		}
		

		
		
		//불에 대한 BFS
		firebfs();
		
		/*for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				System.out.print(firemap[i][j]+" ");
			}
			System.out.println();
		}*/
		

		//지훈이에 대한 BFS
		jhbfs(JHr,JHc);
		
		
	}

	private static void jhbfs(int jhr, int jhc) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {jhr,jhc});
		
		visited[jhr][jhc] = 0;
		
		while(!queue.isEmpty()) {
			
			
			int current [] = queue.poll();
			int currentx = current[0];
			int currenty = current[1];
			
			
			if(currentx==0 || currenty == 0 || currentx == r-1 || currenty == c-1) {
				System.out.println(visited[currentx][currenty]+1);
				return;
			}
			
			
			for(int d=0;d<4;d++) {
				int nx = currentx + dx[d];
				int ny = currenty + dy[d];
				
				if(nx>=0 && ny>=0 && nx<r && ny <c && map[nx][ny]!='#' && visited[nx][ny]==-1) {
					
					if(visited[currentx][currenty]+1 < firemap[nx][ny]) {
						
						queue.offer(new int [] {nx,ny});
						visited[nx][ny] = visited[currentx][currenty]+1;
					}
					
				
					
				}
				
				
				
			}
			
		}
		
		System.out.println("IMPOSSIBLE");
		
		
		
	}

	private static void firebfs() {
		
		
		
		while(!firequeue.isEmpty()) {
			int current [] = firequeue.poll();
			int currentx = current[0];
			int currenty = current[1];
			
			
			for(int d=0;d<4;d++) {
				int nx = currentx + dx[d];
				int ny = currenty + dy[d];
				
				if(nx>=0 && ny>=0 && nx<r && ny <c 
						&& map[nx][ny]!='#' && firemap[nx][ny]==Integer.MAX_VALUE) {
					
					firequeue.offer(new int [] {nx,ny});
					firemap[nx][ny] = firemap[currentx][currenty] +1; 
					
				}
				
				
				
			}
			
			
		}
		
	}
}