package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G4_2636 {
	static boolean[][] visited;
	static int[][] map;
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { -1, 1, 0, 0 };
	static int x;
	static int y;
	static int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();

		map = new int[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		int cnt = 0;
		num =0;
		// 가장자리를 제외하고 확인
		while (true) {
			boolean check = false;
			start: for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					if (map[i][j] == 1) {
						check = true;
						break start;
					}
				}
			}
			if (check == false) // 모두 0이라는 뜻
				break;

			visited = new boolean[x][y];

			bfs(0, 0);
			cnt++;

		}

		System.out.println(cnt);
		System.out.println(num);
	}

	private static void bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		visited[i][j] = true;
		queue.offer(new int[] { i, j });

		int value=0;
		while (!queue.isEmpty()) {

			int[] current = queue.poll();

			for (int c = 0; c < 4; c++) {
				int newx = current[0] + dx[c];
				int newy = current[1] + dy[c];

				if (newx >= 0 && newx < x && newy >= 0 && newy < y && visited[newx][newy] == false) {
					visited[newx][newy] = true;
					if (map[newx][newy] == 0) {
						queue.offer(new int[] { newx, newy });
					} else {
						map[newx][newy] = 0;
						value++;
					}

				}
			}
			
			num = value;

		}

	}
}
