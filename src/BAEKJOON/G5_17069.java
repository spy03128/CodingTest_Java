package BAEKJOON;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class G5_17069 {

	static int dx[] = { 0, 1, 1 };
	static int dy[] = { 1, 1, 0 };
	static int N;
	static int map[][];
	static int cnt = 0;
	static long D[][][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		map = new int[N + 1][N + 1];
		D = new long[N + 1][N + 1][3];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		
		//첫번째 줄 초기화
		for (int j = 2; j <= N; j++) {
			// 초기값 초기화
			if (j == 2) {
				D[1][j][0] = 1;
				D[1][j][1] = 0;
				D[1][j][2] = 0;
			}  
			else {
				if(map[1][j]==0) { 
					
					D[1][j][0] = D[1][j - 1][0] + D[1][j - 1][1];
					D[1][j][1] = D[0][j - 1][0] + D[0][j - 1][1] + D[0][j-1][2];
					D[1][j][2] = D[0][j][1] + D[0][j][2];
				}
			}
		}

		
		for (int i = 2; i <= N; i++) {
			for (int j = 1; j <= N; j++) {

				int current = map[i][j];
				if(current==0) {
					D[i][j][0] = D[i][j - 1][0] + D[i][j - 1][1];
					if(map[i-1][j]==0 && map[i][j-1]==0) {
						
						D[i][j][1] = D[i-1][j - 1][0] + D[i - 1][j - 1][1] + D[i - 1][j-1][2];
					}
					D[i][j][2] = D[i - 1][j][1] + D[i - 1][j][2];
					
				}

			
				//System.out.print(D[i][j][0] +" "+ D[i][j][1]  +" "+  D[i][j][2] +"     ");

			}
			//System.out.println();
		}

		System.out.println(D[N][N][0]+ D[N][N][1]  +  D[N][N][2]);

	}

}
