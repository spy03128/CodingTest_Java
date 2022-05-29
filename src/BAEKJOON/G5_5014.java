package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G5_5014 {
	static int visited [];
	static int F,S,G,U,D;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 F = sc.nextInt();
		 S = sc.nextInt();
		 G = sc.nextInt();
		
		 U = sc.nextInt();
		 D = sc.nextInt();
		
		visited = new int[F+1];
		bfs(S);
		
	}
	private static void bfs(int S) {
		Queue<Integer> queue = new LinkedList<>();
		visited[S] =1;
		queue.offer(S);
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			if(current==G) {
				System.out.println(visited[current]-1);
			}
			
			
			
			int newx = 0;
			newx = current + U;
			
			if(newx>0 && newx<=F && visited[newx]==0) {
				queue.offer(newx);
				visited[newx]=visited[current]+1;
				
				
			}
			
		
			newx = current - D;
			
			if(newx>0 && newx<=F && visited[newx]==0) {
				queue.offer(newx);
				visited[newx]=visited[current]+1;
				
				
			}
			
			
			
		}
		
		if(visited[G]==0) System.out.println("use the stairs");
		
		
		
		
		
	}
}
