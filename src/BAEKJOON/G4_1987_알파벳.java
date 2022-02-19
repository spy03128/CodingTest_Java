package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

public class G4_1987_알파벳 {
	static int num = 0;
	static int max = 0;
	static char[][] arr;
	static int R, C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		R = sc.nextInt();
		C = sc.nextInt();
		sc.nextLine();
		int vis[] = new int[26];

		arr = new char[R][C];
		for (int i = 0; i < R; i++) {
			String s = sc.nextLine();
			arr[i] = s.toCharArray();
		}
		vis[arr[0][0] - 65] = 1;
		recur(0, 0, vis, 1);
		System.out.println(max);
	}

	private static void recur(int r, int c,int[] vis,int num) {
//		System.out.println("현재 좌표" + r + "," + c);
//		System.out.println(num);
		int dx[] = { -1, 1, 0, 0 };
		int dy[] = { 0, 0, -1, 1 };
		
		int newx =0;
		int newy =0;
	
		if(num>max) max=num;
		
		for(int i=0; i<4; i++) {
			newx = r+ dx[i];
			newy = c+ dy[i];
			
			
			if(newx>=0 && newx<R && newy>=0 && newy<C && vis[arr[newx][newy] - 65]==0) {
				vis[arr[newx][newy] - 65]=1;
				recur(newx,newy,vis,num+1);
				vis[arr[newx][newy] - 65]=0;

			}
		}
		

		
		
	}
}
