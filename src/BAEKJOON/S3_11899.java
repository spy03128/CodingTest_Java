package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class S3_11899 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s= sc.nextLine();
		
		Stack<String> close = new Stack<>();
		Stack<String> open = new Stack<>();

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==')') {
				if(!open.empty()) {
					open.pop();
				}else {
					close.push(")");
				}
			}else if(s.charAt(i)=='(') {
				open.push("(");
			}
		}
		
		System.out.println(close.size()+open.size());
		
	}
}
