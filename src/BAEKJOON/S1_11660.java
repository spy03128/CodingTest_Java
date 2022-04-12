package BAEKJOON;

import java.util.Scanner;

public class S1_11660 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] map = new int[N+1][N+1];
		int[][] D = new int[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				map[i][j] = sc.nextInt();
				
			}
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				D[i][j] = D[i-1][j]+D[i][j-1]-D[i-1][j-1]+map[i][j];
				
			}
		}
		
		for(int i=0;i<M;i++) {
			
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			int ex = sc.nextInt();
			int ey = sc.nextInt();
			
			int sum=0;
			
			
			
			sum = D[ex][ey]-D[ex][sy-1]-D[sx-1][ey]+D[sx-1][sy-1];
			
			
			System.out.println(sum);
		}
		
		
	}
}
