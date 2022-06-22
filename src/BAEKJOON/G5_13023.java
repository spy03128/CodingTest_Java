package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

public class G5_13023 {
	static boolean visited[];
	static ArrayList<Integer> array [];
	static int check = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M =sc.nextInt();
		
		array = new ArrayList[N];
		
		for(int i=0;i<N;i++) {
			array[i] = new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			array[a].add(b);
			array[b].add(a);
			
		}
		
		visited = new boolean[N];
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				DFS(i,1);
			}
			if(check==1) break;
		}
		
		
		System.out.println(check);
		
	}
	private static void DFS(int i,int depth) {
		
		if(depth>=5) {
			check = 1;
			return;
		}
		visited[i] = true;
		for(int x:array[i]) {
			if(!visited[x]) DFS(x,depth+1);
		}
		visited[i] =false;
		
	}
}
