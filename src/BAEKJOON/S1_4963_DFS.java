package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_4963_DFS {
   static int W, H, map[][];
   static boolean[][] visited;
   // 좌상, 좌, 좌하, 하, 우하, 우, 우상, 상
   static int[] d_col = {-1,-1,-1, 0, 1, 1, 1, 0};
   static int[] d_row = {-1, 0, 1, 1, 1, 0,-1,-1};
   
   // row 행(가로), col 열(세로)
   private static void dfs(int row, int col) {
      // 방문했다고 표시
      visited[row][col] = true;
      
      // 8방 탐색
      for (int i = 0; i < 8; i++) {
         // 좌상, 좌, 좌하, 하, 우하, 우, 우상, 상
         int next_row = row + d_row[i];
         int next_col = col + d_col[i];
         // 범위내에 있다면
         if(next_row < 0 || next_row >= H || next_col < 0 || next_col >= W)
            continue;
         // 인접한 섬들이 있고 && 방문하지 않았을때
         if(map[next_row][next_col] == 1 && !visited[next_row][next_col])
            // 탐색 실시
            dfs(next_row, next_col);
      }
   }
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder str = new StringBuilder();
      StringTokenizer st = null;

      while(true) {
         // 첫줄은 W, H값을 받아옴
         st = new StringTokenizer(br.readLine(), " ");
         W = Integer.parseInt(st.nextToken());
         H = Integer.parseInt(st.nextToken());
         // 끝값이 0 0이면  while문 정지
         if(W==0&&H==0) break;
         // WxH 크기의 map 생성, visited 생성
         map = new int[H][W];
         visited = new boolean[H][W];
         int cnt = 0;
         
         // map의 값을 받아옴
         for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < W; j++) {
               map[i][j] = Integer.parseInt(st.nextToken());
            }
         }
         // 방문하지 않은 && 섬인경우 dfs 실행 후 cnt++
         for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
               if(!visited[i][j] && map[i][j] == 1) {
                  dfs(i,j);
                  cnt++;
               }
            }
         }
         // 섬의 개수 cnt 출력
         str.append(cnt).append("\n");
      }
      System.out.println(str);
      br.close();
   }
}