package BAEKJOON;

import java.util.PriorityQueue;
import java.util.Scanner;

public class S1_11286 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)-> {
			int x = Math.abs(o1);
			int y = Math.abs(o2);
			
			if(x==y) {
				return o1 - o2;
			}else {
				return x - y;
			}
		
			
		});
		
		for(int i=0;i<N;i++) {
			int n = sc.nextInt();
			
			if(n==0) {
				if(queue.isEmpty()) System.out.println(0);
				else System.out.println(queue.poll());
			}else {
				queue.add(n);
			}
			
			
		}
		
	}
}
