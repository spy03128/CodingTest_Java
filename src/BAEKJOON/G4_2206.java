package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G4_2206 {

	static final int dx[] = { 0, 0, 1, -1 };
	static final int dy[] = { 1, -1, 0, 0 };
	static int n, m, ans;
	static boolean visit[][][];
	static int map[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		visit = new boolean[n][m][2];
		ans = -1;

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		bfs();

		System.out.println(ans);

	}

	private static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0, 0, 1, 0});
		visit[0][0][0] = true;

		while (!q.isEmpty()) {
			int now[] = q.poll();
			int x = now[0];
			int y = now[1];

			if (x == n - 1 && y == m - 1) {
				ans = now[2];
				return;
			}

			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (0 > nx || nx >= n || 0 > ny || ny >= m)
					continue;

				if (map[nx][ny] == 0 && !visit[nx][ny][now[3]]) { // 벽이 아닐경우
					visit[nx][ny][now[3]] = true;
					q.add(new int[] {nx, ny, now[2] + 1, now[3]});
				} else { // 벽이 있는경우
					if (now[3] == 0 && !visit[nx][ny][1]) { // 벽을 부순적이 없을때
						visit[nx][ny][1] = true;
						q.add(new int[]{nx, ny, now[2] + 1, 1});
					}
				}

			}
		}

	}
}