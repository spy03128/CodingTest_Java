package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class S4_18258 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<String> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		String temp = "";
	
		for(int i=0;i<N;i++) {
			String s[] = new String[2];
			s = br.readLine().split(" ");
			
			
			if(s[0].equals("push")) {
				queue.offer(s[1]);
				temp = s[1];
			}else if(s[0].equals("pop")) {
				if(queue.isEmpty()==true) sb.append("-1");
				else sb.append(queue.poll());
				sb.append("\n");
			}else if(s[0].equals("size")) {
				sb.append(queue.size());
				sb.append("\n");
			}else if(s[0].equals("empty")) {
				if(queue.isEmpty()==true) sb.append("1");
				else sb.append("0");
				sb.append("\n");
			}else if(s[0].equals("front")) {
				if(queue.isEmpty()==true) sb.append("-1");
				else sb.append(queue.peek());
				sb.append("\n");
			}else if(s[0].equals("back")) {
				if(queue.isEmpty()==true) sb.append("-1");
				else {
					sb.append(temp);
				}
				sb.append("\n");
			}
			
			
			
			
		}
		System.out.println(sb);
	}
}
