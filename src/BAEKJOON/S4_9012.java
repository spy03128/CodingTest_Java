package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class S4_9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<>();
		int tc = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<tc;i++) {
			stack.clear();
			String result = "YES";
			String s = sc.nextLine();
			
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='(') {
					stack.push(s.charAt(j)+"");
				}else {
					if(stack.isEmpty()) {
						result = "NO";
						break;
					}else {
						if(stack.peek().equals(")")) {
							result = "NO";
							break;
						}else {
							stack.pop();
						}
					}
				}
				
			}
			
			if(!stack.isEmpty()) result="NO";
			
			sb.append(result).append("\n");
			
			
		}
	
		System.out.println(sb);
	}
}
