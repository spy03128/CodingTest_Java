package BAEKJOON;

import java.util.Scanner;

public class S2_10819 {
	static int N;
	static int[] arr,result;
	static boolean[] visited;
	static int max =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 arr = new int[N];
		 result = new int[N];
		 visited = new boolean[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		permu(0);
		System.out.println(max);
		
	}

	private static void permu(int cnt) {
		if(cnt==N) {
			int sum=0;
			
			for(int i=0;i<N-1;i++) {
				sum+= Math.abs(result[i]-result[i+1]);
			}
			if(sum>max) max=sum;
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				visited[i] = true;
				result[cnt] = arr[i];
				permu(cnt+1);
				visited[i] = false;
			}
		}
		
	}
}
