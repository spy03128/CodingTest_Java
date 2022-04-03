package BAEKJOON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_2667 {
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int[][] map;
	static boolean[][] visited;
	static int N;
	static ArrayList<Integer> list;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		sc.nextLine();
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			String s = sc.nextLine();
			for(int j=0;j<N;j++) {
				map[i][j] = s.charAt(j)-'0';
			}
		}
		
		list= new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(visited[i][j] == false && map[i][j] == 1 ) {
					bfs(i,j);
				}
			}
		}
		
		int[] result = new int[list.size()];
		int idx=0;
		for(int x : list) {
			result[idx++] = x;
		}
		
		Arrays.sort(result);
		
		System.out.println(result.length);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}

	private static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {x,y});
		visited[x][y] = true;
		int num=1;
		
		while(!queue.isEmpty()) {
			
			int current [] = queue.poll();
			
			for(int i =0 ; i<4;i++) {
				int newx = current[0] + dx[i];
				int newy = current[1] + dy[i];
				
				
				
				if(newx>=0 && newx <N && newy>=0 && newy <N && visited[newx][newy]==false && map[newx][newy] ==1) {
					queue.offer(new int[] {newx,newy});
					visited[newx][newy] = true;
					num++;
				}
				
				
			}
			
			
			
		}
		
		list.add(num);
		
	}
}
