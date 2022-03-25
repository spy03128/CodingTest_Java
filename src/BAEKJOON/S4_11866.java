package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S4_11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			queue.offer(i);
		}
		
		sb.append("<");
		while(true) {
			if(queue.isEmpty()==true) break;
			
			for(int i=1;i<K;i++) {
				int x = queue.poll();
				queue.offer(x);
			}
			
			if(queue.size()==1) {
				sb.append(queue.poll()).append(">");
			}else {
			sb.append(queue.poll()).append(", ");
		
			}
		}
		
		System.out.println(sb);
	}
}
