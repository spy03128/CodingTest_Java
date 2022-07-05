package BAEKJOON;

import java.util.Scanner;

public class S3_1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		int arr[][] = new int[41][2];
		
		arr[0][0] = 1;
		arr[1][1] = 1;
		
		for(int i=2;i<=40;i++) {
			arr[i][0] = arr[i-1][0] + arr[i-2][0];
			arr[i][1] = arr[i-1][1] + arr[i-2][1];
		}
		
		for(int i=0;i<tc;i++) {
			int n = sc.nextInt();
			System.out.println(arr[n][0]+" "+arr[n][1]);
		}
	}
}
