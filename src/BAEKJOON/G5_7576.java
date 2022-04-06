package BAEKJOON;

/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class G5_7576 {
	static int map [][];
	static boolean visited[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int c,r;
	static int result = 0;
	static Queue<int[]> queue = new LinkedList<>();
	
 	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		 c = sc.nextInt();
		 r = sc.nextInt();

		
		map= new int[r][c];
		visited = new boolean[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		
		
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(visited[i][j] == false && map[i][j] ==1) {
					queue.offer(new int[] {i,j});
					visited[i][j] = true;
					
				}
			}
		}
		bfs();
		
		check: for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(map[i][j] ==0) {
					result = -1;
					break check; 
				}
			}
		}
		
		System.out.println(result);
		
		
	}
	private static void bfs() {
		
		
		
		
		int cnt=0;
		
		while(!queue.isEmpty()) {
			boolean ch = false;
			
			chfor: for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(map[i][j]==0) {
						ch = true;
						break chfor;
					}
				}
			}
			
			
			if(ch == true) cnt++;
			
			
			int qsize= queue.size();
			for(int f =1; f<=qsize;f++) {
				
				int [] current = queue.poll();
				
				
				for(int a=0;a<4;a++) {
					int newx = current[0] + dx[a];
					int newy = current[1] + dy[a];
					
					
					if(newx>=0 && newy>=0 && newx<r && newy<c && visited[newx][newy]==false && map[newx][newy]==0) {
						queue.offer(new int [] {newx,newy});
						visited[newx][newy] = true;
						map[newx][newy] = 1;
					}
					
					
					
					
				}
			}
			
			
	
		}
		
		if(cnt>result) result=cnt;
		
		
	}
}*/






import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G5_7576 {
   static int N,M;
   static int[][] arr;
   static int[] dx = {1,-1,0,0};
   static int[] dy = {0,0,-1,1};
   static Queue<int[]> q = new LinkedList<>();
   
   static void bfs() {

      while(!q.isEmpty()) {
         int[] now = q.poll();
         int x = now[0];
         int y = now[1];
         
         for(int i = 0; i<4 ; i++) {
            int nx = dx[i]+x;
            int ny = dy[i]+y;
            if(0<=nx && nx<M && 0<=ny && ny<N && arr[nx][ny]==0) {
               q.offer(new int[] {nx,ny});
               arr[nx][ny] = arr[x][y] +1;
            }
         }
      }
   }
   
   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());
      
      arr = new int[M][N];
      
      for(int i = 0; i<M; i++) {
         st = new StringTokenizer(br.readLine());
         for(int j = 0 ; j<N ; j++) {
            arr[i][j] = Integer.parseInt(st.nextToken());
         }
      }
      
      for(int i = 0 ; i<M ; i++) {
         for(int j = 0; j<N ; j++) {
            if(arr[i][j]==1) q.offer(new int[] {i,j});
         }
      }
      
      bfs();
      
      int result = 0;
      boolean check = false;
      int max;
      for(int i = 0; i<M ; i++) {
         check = false;
         max = Integer.MIN_VALUE;
         for(int j = 0; j<N ;j++) {
            if(arr[i][j]==0) {
               check = true;
               break;
            }
            else max = Math.max(max, arr[i][j]);
         }
         if(check) {
            result = -1;
            break;
         }
         else result = Math.max(result, max-1);
      }
      
      System.out.println(result);
      
   }
}
