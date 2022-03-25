package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class S4_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int K = sc.nextInt();
		for(int i=0;i<K;i++) {
			int x = sc.nextInt();
			if(x!=0) stack.add(x);
			else {
				stack.pop();
			}
		}
		
		int sum=0;
		while(!stack.isEmpty()) {
			sum+= stack.pop();
		}
		
		System.out.println(sum);
	}
}
