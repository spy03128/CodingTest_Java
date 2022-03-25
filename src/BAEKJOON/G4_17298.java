package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class G4_17298 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer[]> stack = new Stack<>();

		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int result[] = new int[N];
		Integer arr[] = new Integer[2];
		for(int i=0;i<N;i++) {
			result[i] = -1;
		}
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(st.nextToken());
			

			if (!stack.isEmpty()) {
				if ((int) (stack.peek()[0]) < x) {
					while (!stack.isEmpty() && stack.peek()[0]<x ) {
					
						result[stack.pop()[1]] = x;
					
					}
				}
			}
		
			stack.push(new Integer[] {x,i});

			
		}

		for (int i = 0; i < N; i++) {
			sb.append(result[i]).append(" ");
		}
		System.out.println(sb);

	}
}
