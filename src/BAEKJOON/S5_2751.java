package BAEKJOON;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class S5_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		boolean visited [] = new boolean[2000001];
		
	
		
		for (int i = 0; i < N; i++) {
			int s = Integer.parseInt(br.readLine());
			visited[s+1000000] = true;
		}
		
		
		for (int i = 0; i <=2000000; i++) {
			if(visited[i] == true) {
				sb.append(i-1000000).append("\n");
			}
		}
		
		System.out.println(sb);
		

		
		
		
	}
}