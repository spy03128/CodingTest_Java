package BAEKJOON;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class S4_10866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deque = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<N;i++) {
			String s [] =  sc.nextLine().split(" ");
			if(s[0].equals("push_front")) {
				deque.offerFirst(Integer.parseInt(s[1]));
			}else if(s[0].equals("push_back")) {
				deque.offerLast(Integer.parseInt(s[1]));

			}else if(s[0].equals("pop_front")) {
				if(!deque.isEmpty()) {
					sb.append(deque.pollFirst()).append("\n");
				}else sb.append("-1").append("\n");
			}else if(s[0].equals("pop_back")) {
				if(!deque.isEmpty()) {
					sb.append(deque.pollLast()).append("\n");
				}else sb.append("-1").append("\n");
			}else if(s[0].equals("size")) {
				
					sb.append(deque.size()).append("\n");
		
			}else if(s[0].equals("empty")) {
				if(!deque.isEmpty()) {
					sb.append("0").append("\n");
				}else sb.append("1").append("\n");
			}else if(s[0].equals("front")) {
				if(!deque.isEmpty()) {
					sb.append(deque.peekFirst()).append("\n");
				}else sb.append("-1").append("\n");
			}else if(s[0].equals("back")) {
				if(!deque.isEmpty()) {
					sb.append(deque.peekLast()).append("\n");
				}else sb.append("-1").append("\n");
			}
			
			
		}
		System.out.println(sb);
	}
	
}
