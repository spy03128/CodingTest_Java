package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class G4_1707 {
	static int visited[];
	static ArrayList<Integer> [] arr;
	static boolean check = false;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int t=0;t<tc;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			check = false;
			arr = new ArrayList[V+1];
			visited = new int[V+1];
			for(int i=0;i<=V;i++) {
				arr[i] = new ArrayList<Integer>();
			}
			
			for(int i=0;i<E;i++) {
				StringTokenizer str = new StringTokenizer(br.readLine()," ");

				int a = Integer.parseInt(str.nextToken()); 
				int b = Integer.parseInt(str.nextToken()); 
				
				
				arr[a].add(b);
				arr[b].add(a);
												
			}
			
			for(int i=1;i<=V;i++) {
				if(visited[i]==0) {
					visited[i] = 1;
					DFS(i);
				}
				if(check) break;
			}
			if(check) System.out.println("NO");
			else System.out.println("YES");
		}
		
	}
	private static void DFS(int i) {
		if(check) return;
		

		for(Integer x : arr[i]) {
			if(visited[i]==visited[x]) {
				//이분 그래프 아님
				check = true;
				return;
			}
			else if(visited[x]==0) {
				if(visited[i]==1) {
					visited[x] = 2;
					DFS(x);
				}else if(visited[i]==2) {
					visited[x] = 1;
					DFS(x);			
				}
			}
			
		}
		
	}
}
