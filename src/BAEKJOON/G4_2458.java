package BAEKJOON;

import java.util.Scanner;

public class G4_2458 {

	static final int INF = 9999999;
	static int N, M, adjMatrix[][];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 학생 수
		M = sc.nextInt(); // 키 비교횟수
		adjMatrix = new int[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				adjMatrix[i][j] = INF;
			}
		}

		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			adjMatrix[x - 1][y - 1] = 1;
		}

		for (int i = 0; i < N; i++) {

			adjMatrix[i][i] = 0;
		}

		for (int k = 0; k < N; ++k) {
			for (int i = 0; i < N; ++i) {
				if (i == k)
					continue;
				for (int j = 0; j < N; ++j) {
					if (i == j || k == j)
						continue;
					if (adjMatrix[i][j] > adjMatrix[i][k] + adjMatrix[k][j]) {
						adjMatrix[i][j] = adjMatrix[i][k] + adjMatrix[k][j];
					}
				}
			}

		}

		int cnt = 0;

		for (int j = 0; j < N; ++j) {
			boolean notnum = false;
			for (int i = 0; i < N; ++i) {

				if (adjMatrix[i][j] == INF) {

					if (adjMatrix[j][i] == INF) {
						notnum = true;
						break;
					}

				}

			}

			if (notnum == false)
				cnt++;

		}

		System.out.println(cnt);

	}

}
