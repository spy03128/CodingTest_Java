package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S4_10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int end = 0;
		int N = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<N;i++) {
			String s = sc.nextLine();
			String[] temp = s.split(" ");
			if(temp[0].equals("push")) {
				queue.offer(Integer.parseInt(temp[1]));
				end = Integer.parseInt(temp[1]);
			}else if(s.equals("pop")) {
				if(!queue.isEmpty()) {
					sb.append(queue.poll()).append("\n");
				}else sb.append("-1").append("\n"); 
			}else if(s.equals("size")) {
				sb.append(queue.size()).append("\n");
			}else if(s.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append("1").append("\n");
				}else sb.append("0").append("\n"); 
			}else if(s.equals("front")) {
				if(!queue.isEmpty()) {
					sb.append(queue.peek()).append("\n");
				}else sb.append("-1").append("\n"); 
			}else if(s.equals("back")) {
				if(!queue.isEmpty()) {
					sb.append(end).append("\n");
				}else sb.append("-1").append("\n"); 
			}
		}
		
		System.out.println(sb);
	}
}
