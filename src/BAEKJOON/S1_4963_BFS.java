package BAEKJOON;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1_4963_BFS {
   static int[][] map;
   static boolean[][] visited;
   static int m, n, cnt;
   static int[] dx = { -1, -1, 0, 1, 1, 1, 0, -1 };
   static int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };

   static class Node {
      int x, y;

      public Node(int x, int y) {
         this.x = x;
         this.y = y;
      }
   }

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         m = Integer.parseInt(st.nextToken());
         n = Integer.parseInt(st.nextToken());
         cnt = 0;

         if (n == 0 && m == 0) break;

         map = new int[n][m];
         visited = new boolean[n][m];

         for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
               map[i][j] = Integer.parseInt(st.nextToken());
            }
         }

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if (map[i][j] == 1 && !visited[i][j]) {
                  bfs(i, j);
                  cnt += 1;
               }
            }
         }

         System.out.println(cnt);
      }

   }

   public static void bfs(int i, int j) {

      Queue<Node> q = new LinkedList<Node>();
      visited[i][j] = true;
      q.offer(new Node(i, j));

      while (!q.isEmpty()) {
         Node cur = q.poll();
         for (int dir = 0; dir < 8; dir++) {
            int nx = dx[dir] + cur.x;
            int ny = dy[dir] + cur.y;
            if (nx >=0 && nx < n && ny>= 0 && ny < m && !visited[nx][ny] && map[nx][ny]==1) {
               visited[nx][ny] = true;
               q.offer(new Node(nx, ny));
            }
         }
      }

   }
}