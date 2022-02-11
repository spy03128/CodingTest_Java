package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S5_1158 {
	static int K=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		K = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		
		for(int i = 1; i<=N;i++) {
			queue.offer(i);
		}
		
		System.out.print("<");
		while(queue.size()!=0) {
			for(int i=1;i<K;i++) {
				int x = queue.poll();
				queue.offer(x);
			}
			int y = queue.poll();
			System.out.print(y);
			if(queue.size()!=0) System.out.print(", ");
		}
		System.out.println(">");
		
	}
}
