package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1_1325 {
	static boolean[] visited;
	static int[] num;
	static ArrayList<Integer> list[];
	static int max=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		list = new ArrayList[N+1];
		num = new int[N+1];
		for(int i=0;i<=N;i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		
		for(int i=0;i<M;i++) {
			StringTokenizer s = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(s.nextToken());
			int b = Integer.parseInt(s.nextToken());
			
			list[a].add(b);
		}
		
		for(int i=1;i<=N;i++) {
			visited= new boolean[N+1];
			BFS(i);
		}
		
		for(int i=1;i<=N;i++) {
			if(num[i]>max) max=num[i];
		}
		for(int i=1;i<=N;i++) {
			if(num[i]==max) sb.append(i).append(" ");
		}
		System.out.println(sb);
	}
	private static void BFS(int i) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(i);
		visited[i] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			
			for(int x:list[current]) {
				if(!visited[x]) {
					queue.add(x);
					visited[x]= true;
					num[x]++;
				}
			}
			
			
		}
		
	
		
	}
}
