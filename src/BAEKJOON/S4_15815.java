package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class S4_15815 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] st = sc.nextLine().split("");
		
		Stack<Integer> stack = new Stack<>();
		int s =0;
		
		for(int i=0; i<st.length;i++) {
			if(st[i].equals("*") || st[i].equals("-") || st[i].equals("+") ||st[i].equals("/")) {
				if(st[i].equals("*")) {
					s = stack.pop() * stack.pop();
				}else if(st[i].equals("-")) {
					int x = stack.pop();
					int y = stack.pop();
					s = y-x;
					
				}else if(st[i].equals("+")) {
					s = stack.pop() + stack.pop();
				}else if(st[i].equals("/")) {
					int x = stack.pop();
					int y = stack.pop();
					s = y / x;
				}
				
				stack.add(s);
				
			}else {
				stack.add(Integer.parseInt(st[i]));
			}
		}
		
		System.out.println(s);
		
	}
}
