package BAEKJOON;

import java.util.Scanner;

public class S1_1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int R[] = new int[N + 1];
		int G[] = new int[N + 1];
		int B[] = new int[N + 1];

		int D[][] = new int[N + 1][3];

		for (int i = 1; i <= N; i++) {
			R[i] = sc.nextInt();
			G[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}

		for (int i = 1; i <= N; i++) {

			D[i][0] = R[i] + Math.min(D[i - 1][1], D[i - 1][2]);
			D[i][1] = G[i] + Math.min(D[i - 1][0], D[i - 1][2]);
			D[i][2] = B[i] + Math.min(D[i - 1][0], D[i - 1][1]);

		}
		int temp = Math.min(D[N][0], D[N][1]);
		
		
		System.out.println(Math.min(temp, D[N][2]));

	}
}
