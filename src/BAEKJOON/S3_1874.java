package BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class S3_1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		for (int i = 2; i <= N; i++) {
			queue.offer(i);
		} // {2,3, ... }

		stack.push(1);
		sb.append("+").append("\n");
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (stack.isEmpty() == false) {
				if (stack.peek() > x) {
					sb.delete(0, sb.length());
					sb.append("NO");
					break;
				}
			}

			if (stack.isEmpty() == true || stack.peek() < x) {
				while (true) {
					int y = queue.poll();
					stack.push(y);
					sb.append("+").append("\n");
					if (y == x)
						break;
				}
			}

			if (stack.peek() == x) {
				stack.pop();
				sb.append("-").append("\n");
			}

		}

		System.out.println(sb);

	}
}
