package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class S2_1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stackA = new Stack<>();
		Stack<Character> stackB = new Stack<>();

		String s = br.readLine();
		
		for(int i=0;i<s.length();i++) {
			stackA.push(s.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
	
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String temp = st.nextToken();
			if(temp.equals("P")) {	
				stackA.push(st.nextToken().charAt(0));
			}else {
				if(temp.equals("L")) {
					if(!stackA.isEmpty()) stackB.push(stackA.pop());
				}
				else if(temp.equals("D")) {
					if(!stackB.isEmpty()) stackA.push(stackB.pop());
				}
				else if(temp.equals("B")) {
					if(!stackA.isEmpty()) stackA.pop();
					
				}
				
			}
		}
		
		while(!stackA.isEmpty()) {
			stackB.push(stackA.pop());
		}
		
		while(!stackB.isEmpty()) sb.append(stackB.pop());
		
		System.out.println(sb);
		
	}
}
