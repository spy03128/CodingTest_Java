package BAEKJOON;

import java.util.Scanner;

public class S3_15651 {
	static int N, M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		permu(0);
		System.out.println(sb);
	}

	private static void permu(int cnt) {
		if (cnt == M) {
			
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[cnt] = i+1;
			permu(cnt + 1);
		}
	}
}
