package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class G4_13913 {


	static int visited[];
	static int index[];
	static int N,K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 K = sc.nextInt();
		
		visited = new int[100001];
		index = new int[100001];
		
		bfs(N);
	}

	private static void bfs(int n) {
		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		queue.offer(n);
		visited[n] = 1;
		index[n] = -1;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			if(current==K) {
				System.out.println(visited[current]-1);
				stack.push(current);
			
				while(true) {
					if(index[current]==-1) break;
					stack.push(index[current]);
					current = index[current];
				}
				
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
					System.out.print(" ");
				}
				
				break;
			}
			
			int newx = 0 ;
			
			newx = current * 2;
			
			if(newx>=0 && newx<100001 && visited[newx]==0) {
				queue.offer(newx);
				visited[newx] = visited[current]+1;
				index[newx] = current;
			}
			
			newx = current - 1;
			
			if(newx>=0 && newx<100001 && visited[newx]==0) {
				queue.offer(newx);
				visited[newx] = visited[current] +1;
				index[newx] = current;
				
			}
			
			newx = current + 1;
			if(newx>=0 && newx<100001 && visited[newx]==0) {
				queue.offer(newx);
				visited[newx] = visited[current] +1;
				index[newx] = current;
				
			}
			

			
		}
		
	}
}
