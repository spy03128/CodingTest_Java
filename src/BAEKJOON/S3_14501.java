package BAEKJOON;

import java.util.Scanner;

public class S3_14501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[][] = new int[N+2][2];
		
		int D[] = new int[N+2];
		
		for(int i=1;i<=N;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			
		}
		
		
		for(int i=N;i>0;i--) {
			
			int next = i+ arr[i][0];
			if(next>N+1) D[i] = D[i+1];
			else {
				D[i] = Math.max(D[i+1], D[next]+arr[i][1]);
			}
			
		}
		
		System.out.println(D[1]);
		
		
	}
}
