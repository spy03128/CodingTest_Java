package BAEKJOON;


import java.util.Scanner;

public class  G4_1520 {
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int map[][];
	static int dp[][];
	static boolean visited[][];
	static int M,N;
	static int cnt;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		
		
			
			M = sc.nextInt(); //세로 값 입력받기
			N = sc.nextInt(); //가로 값 입력받기
			
			 map = new int[M][N]; //맵 생성
			 visited = new boolean[M][N]; //방문처리 배열 생성
			 dp = new int[M][N];
 			
			for(int i=0;i<M;i++) { //세로 줄 만큼 반복
				for(int j=0;j<N;j++) { //가로 줄 만큼 반복
					map[i][j] = sc.nextInt(); //맵 입력받기
					dp[i][j] = -1;
				}
			}
			
			
			
			cnt = dfs(0,0); //0,0 지점부터 dfs 탐색 시작
			
			System.out.println(cnt); //값 출력하기
			
			
			
			

		
	}

	private static int dfs(int i, int j) {
		
	
		
		if(i == M-1 && j==N-1) { //도착지점에 도착하면 
			
			return 1; //리턴
		}
		
		if(dp[i][j]!=-1) return dp[i][j];
		dp[i][j]=0;
		for(int d=0;d<4;d++) { //4방탐색
			
			int nx = i + dx[d]; //새로운 x값 갱신
			int ny = j + dy[d]; //새로운 y값 갱신
			
			
			//범위를 벗어나지않고, 방문하지 않았고, 내리막으로 이동한다면
			if(nx>=0 && ny >=0 && nx<M && ny<N
					&& map[i][j]>map[nx][ny]) {
				
				
				dp[i][j]+=dfs(nx,ny); //다음 지점 dfs 탐색
			
			}
				
			
		}
		
		return dp[i][j];
		
	}
}
