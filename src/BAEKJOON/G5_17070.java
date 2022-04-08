package BAEKJOON;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class G5_17070 {

	static int dx[] = { 0, 1, 1 };
	static int dy[] = { 1, 1, 0 };
	static int N;
	static int map[][];
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		dfs(0, 1, 0); // x, y , shape

		System.out.println(cnt);

	}

	private static void dfs(int i, int j, int k) {

		if (i == N - 1 && j == N - 1) {
			cnt++;
			return;
		}
		List<Integer> list = new LinkedList<Integer>();

		// 파이프 모양으로 분류
		switch (k) {
		case 0: // 가로
			list.add(0);
			list.add(1);
			break;
		case 1: // 대각선
			list.add(0);
			list.add(1);
			list.add(2);
			break;
		case 2: // 세로
			list.add(1);
			list.add(2);
			break;

		}

		for (int f = 0; f < list.size(); f++) {
			int face = list.get(f);
			int newx = i + dx[face];
			int newy = j + dy[face];

			if (face==1) { 
				if (newx >= 0 && newy >= 0 && newx < N && newy < N 
						&& map[newx][newy] == 0 && map[newx-1][newy] ==0 && map[newx][newy-1] ==0) {
					dfs(newx, newy, face);
				}
			} else {

				if (newx >= 0 && newy >= 0 && newx < N && newy < N && map[newx][newy] == 0) {

					dfs(newx, newy, face);
				}

			}
		}

	}
}
