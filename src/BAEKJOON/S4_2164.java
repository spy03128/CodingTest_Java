package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S4_2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			queue.offer(i);
		}
		while(true) {
			if(queue.size()==1) {
				System.out.println(queue.poll());
				break;
			}
			
			queue.poll();
			int x = queue.poll();
			queue.offer(x);
			
			
		}
	}
}
