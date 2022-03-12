package BAEKJOON;

import java.util.Scanner;

public class B2_2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[15][14];
		
		for(int j=0;j<14;j++) {
			arr[0][j] = j+1;
		}
		
		for(int i=1;i<15;i++) {
			for(int j=0; j<14;j++) {
				for(int x=0;x<=j;x++) {
					arr[i][j] += arr[i-1][x];
				}
			}
		}
		
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println(arr[r][c-1]);
		}
	}
}
