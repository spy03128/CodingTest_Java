package BAEKJOON;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class S4_10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<N;i++) {
			String s[] = sc.nextLine().split(" ");
			
			if(s[0].equals("push")) {
				stack.add(s[1]);
			}else if(s[0].equals("pop")) {
				if(stack.isEmpty()==true) sb.append("-1");
				else sb.append(stack.pop());
				sb.append("\n");
			}else if(s[0].equals("size")) {
				sb.append(stack.size());
				sb.append("\n");
			}else if(s[0].equals("empty")) {
				if(stack.isEmpty()==true) sb.append("1");
				else sb.append("0");
				sb.append("\n");
			}else if(s[0].equals("top")) {
				if(stack.isEmpty()==true) sb.append("-1");
				else sb.append(stack.peek());
				sb.append("\n");
			}
			
		}
		
		System.out.println(sb);
	}
}
