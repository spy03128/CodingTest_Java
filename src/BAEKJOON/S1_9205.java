package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_9205 {
	static int n;
	static  int store [][] ;
	static boolean visited[];
	
	static boolean go;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		for(int tc=0;tc<testcase;tc++ ) {
			
			go= false;
			
			 n = sc.nextInt(); //편의점개수
			int hx = sc.nextInt();
			int hy = sc.nextInt();
			
			store = new int[n+1][2];
			visited = new boolean[n+1];
			
			for(int i=0;i<n;i++) {
				
				store[i][0]= sc.nextInt();
				store[i][1] = sc.nextInt();
				
				
			}
			
			store[n][0] = sc.nextInt();
			store[n][1] = sc.nextInt();
			
	
			
			
			bfs(hx,hy);
			
			
			if(go) System.out.println("happy");
			else System.out.println("sad");
			
			
		}
		
		
		
		
	}

	private static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x,y});
		
		while(!queue.isEmpty()) {
			
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			boolean check=false;
			
			for(int i=0;i<=n;i++) {
				if(!visited[i]) {
					
					int dx = Math.abs(cx - store[i][0]);
					int dy = Math.abs(cy - store[i][1]);
					
					
					if(dx+dy<=1000) {
						visited[i] = true;
						queue.offer(new int[] {store[i][0],store[i][1]});
						check = true;
					}
				}
				
				
			}
			
			if(!check) continue;
			
			
			if(visited[n]) {
				go= true;
				break;
			}
			
			
		}
		
		
		
	}
}
