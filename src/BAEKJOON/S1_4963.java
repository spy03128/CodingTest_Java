package BAEKJOON;

import java.util.Scanner;

public class S1_4963 {
	static int map [][];
	static int check[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			int num =0;
			if(w==0 && h==0) break;
			
			map = new int[h][w];
			check = new int[h][w];
			
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(map[i][j]==1) {
						recur(i,j);
					}
				}
			}
			
			
			System.out.println(num);
		}
	}

	private static void recur(int i, int j) {
		// 북 북서 서 남서 남 남동 동 북동 
		int dx[] = {-1,-1,0,1,1,1,0,-1};
		int dy[] = {0,1,1,1,0,-1,-1,-1};
		
		check[i][j] = 1;
		
		
		
	}
}
