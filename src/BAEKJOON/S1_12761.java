package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S1_12761 {
	static boolean visited[];
	static int N,M,A,B;
	static int dx[] = {-1,1,1,-1,1,-1};
	static int size=0;
	static int cnt=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		
		size = (N>M)?N:M;
		
		dx[2] *=A;
		dx[3] *=A;
		dx[4] *=B;
		dx[5] *=B;
		visited = new boolean[size+1];
		
		bfs(N);
		
		System.out.println(cnt);
		
		
	}

	private static void bfs(int n) {
		visited[n] = true;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(n);
		
		while(!queue.isEmpty()) {
			if(visited[M]) return;
			int qs = queue.size();
			
			for(int q=0;q<qs;q++) {
				
				int current = queue.poll();
				
				for(int i=0;i<6;i++) {
					int nx = current + dx[i];
					
					if(nx>=0 && nx<=size && !visited[nx]) {
						queue.offer(nx);
						visited[nx]=true;
					}
					
				}
				
				int nx = current * A;
				if(nx>=0 && nx<=size && !visited[nx]) {
					queue.offer(nx);
					visited[nx]=true;
				}
				nx = current * B;
				if(nx>=0 && nx<=size && !visited[nx]) {
					queue.offer(nx);
					visited[nx]=true;
				}
			}
			
			cnt++;
			
			
			
			
		}
		
		
	}
}
