package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class G5_10026 {
	
	static boolean[][] visited;
	static int n, cnt, precnt;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	static class Node {
		int x, y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
	
			cnt = 0;

			if (n == 1 && n == 1) {
				System.out.println(1);
				
			}

			char[][] map = new char[n][n];
			visited = new boolean[n][n];

			for (int i = 0; i < n; i++) {
			
				map[i]=sc.nextLine().toCharArray();
			}
	
			
			//일반인
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if ((map[i][j] == 'R') && !visited[i][j]) {
						r_bfs(i, j,map);
						precnt += 1;
					}
					if ((map[i][j] == 'G') && !visited[i][j]) {
						g_bfs(i, j,map);
						precnt += 1;
					}
					if ((map[i][j] == 'B') && !visited[i][j]) {
						b_bfs(i, j,map);
						precnt += 1;
					}
				}
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					visited[i][j] = false;
				}
			}
			//적록색약
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if ((map[i][j] == 'R' || map[i][j] == 'G') && !visited[i][j]) {
						bfs(i, j,map);
						cnt += 1;
					}
					if ((map[i][j] == 'B') && !visited[i][j]) {
						b_bfs(i, j,map);
						cnt += 1;
					}
				}
			}
			
			
			System.out.print(precnt +" ");
			System.out.println(cnt);
		

	}

	public static void bfs(int i, int j,char [][] map) {

		Queue<Node> q = new LinkedList<Node>();
		visited[i][j] = true;
		q.offer(new Node(i, j));

		while (!q.isEmpty()) {
			Node bfsnode = q.poll();
			for (int dir = 0; dir < 4; dir++) {
				int nx = dx[dir] + bfsnode.x;
				int ny = dy[dir] + bfsnode.y;
				if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && (map[nx][ny] == 'R' || map[nx][ny] == 'G')) {
					visited[nx][ny] = true;
					q.offer(new Node(nx, ny));
				}
			}
		}

	}
	
	
	
	public static void r_bfs(int i, int j,char [][] map) {

		Queue<Node> q = new LinkedList<Node>();
		visited[i][j] = true;
		q.offer(new Node(i, j));

		while (!q.isEmpty()) {
			Node bfsnode = q.poll();
			for (int dir = 0; dir < 4; dir++) {
				int nx = dx[dir] + bfsnode.x;
				int ny = dy[dir] + bfsnode.y;
				if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && (map[nx][ny] == 'R')) {
					visited[nx][ny] = true;
					q.offer(new Node(nx, ny));
				}
			}
		}

	}
	
	
	
	public static void g_bfs(int i, int j,char [][] map) {

		Queue<Node> q = new LinkedList<Node>();
		visited[i][j] = true;
		q.offer(new Node(i, j));

		while (!q.isEmpty()) {
			Node bfsnode = q.poll();
			for (int dir = 0; dir < 4; dir++) {
				int nx = dx[dir] + bfsnode.x;
				int ny = dy[dir] + bfsnode.y;
				if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && (map[nx][ny] == 'G')) {
					visited[nx][ny] = true;
					q.offer(new Node(nx, ny));
				}
			}
		}

	}
	
	
	public static void b_bfs(int i, int j,char [][] map) {

		Queue<Node> q = new LinkedList<Node>();
		visited[i][j] = true;
		q.offer(new Node(i, j));

		while (!q.isEmpty()) {
			Node bfsnode = q.poll();
			for (int dir = 0; dir < 4; dir++) {
				int nx = dx[dir] + bfsnode.x;
				int ny = dy[dir] + bfsnode.y;
				if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && (map[nx][ny] == 'B')) {
					visited[nx][ny] = true;
					q.offer(new Node(nx, ny));
				}
			}
		}

	}
}