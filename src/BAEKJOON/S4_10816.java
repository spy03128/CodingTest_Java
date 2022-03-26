package BAEKJOON;

import java.util.Scanner;

public class S4_10816 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int arr[] = new int[20000001];
		for(int i=0;i<N;i++) {
			int x= sc.nextInt();
			arr[x+10000000]++;
		}
		
		int M = sc.nextInt();
		
		for(int i=0;i<M;i++) {
			int x = sc.nextInt();
			sb.append(arr[x+10000000]).append(" ");
		}
		
		System.out.println(sb);
	}
}
