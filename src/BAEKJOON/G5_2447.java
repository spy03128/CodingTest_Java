package BAEKJOON;

import java.util.Scanner;

public class G5_2447 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int sum = 3;
		int idx = 0;
		for(int i=2;i<8;i++) {
			sum *= 3;
			if(sum==n) idx = i;
		}
		
		
		int map [][] = new int[n][n];
		
		map[0][0] = map[0][1] = map[0][2] = 1;
		map[1][0] = map[1][2] = 1;
		map[2][0] = map[2][1] = map[2][2] = 1;

		
		int dx [] = {0,0,1,1,2,2,2};
		int dy [] = {1,2,0,2,0,1,2};
		for(int i=2;i<=idx;i++) {
			int pw = (int)Math.pow(3, i-1);
			for(int x=0;x<pw;x++) {
				for(int y=0;y<pw;y++) {
					
					for(int d=0;d<7;d++) {
						int nx = x+ dx[d]*pw;
						int ny = y+ dy[d]*pw;
						
						map[nx][ny] = map[x][y];

					}
					
				}
			}
			
			
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j]==1) sb.append("*");
				else sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
