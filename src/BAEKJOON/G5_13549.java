package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G5_13549 {

	static int visited[];
	static int N,K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 K = sc.nextInt();
		
		visited = new int[100001];
		
		bfs(N);
	}

	private static void bfs(int n) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(n);
		visited[n] = 1;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			if(current==K) {
				System.out.println(visited[current]-1);
				break;
			}
			
			int newx = 0 ;
			
			newx = current * 2;
			
			if(newx>=0 && newx<100001 && visited[newx]==0) {
				queue.offer(newx);
				visited[newx] = visited[current];
				
			}
			
			newx = current - 1;
			
			if(newx>=0 && newx<100001 && visited[newx]==0) {
				queue.offer(newx);
				visited[newx] = visited[current] +1;
				
			}
			
			newx = current + 1;
			if(newx>=0 && newx<100001 && visited[newx]==0) {
				queue.offer(newx);
				visited[newx] = visited[current] +1;
				
			}
			
			
			
			
			
			
		}
		
	}
}
