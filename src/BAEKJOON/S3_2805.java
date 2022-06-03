package BAEKJOON;

import java.util.Scanner;

public class S3_2805 {
	static long answer = 0;
	static long M;
	static long tree[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		M = sc.nextLong();
		tree = new long[N];
		long end =0 ;
		for(int i=0;i<N;i++) {
			tree[i] = sc.nextLong();
			if(tree[i]>end) end = tree[i];
		}
		
		binary(0,end);
		System.out.println(answer);
		
	}
	private static void binary(long start, long end) {
		if(start>end) return;
		
		long mid = (start+end)/2;
		
		if (getM(mid) >= M) {	
			if(answer < mid) {
				answer = mid;       
			}
			binary(mid+1,end);    
		}
		else {
			binary(start, mid - 1);
		}
		
	}
		
	public static long getM(long mid) {
		long sum = 0;
		for (int i = 0; i < tree.length; i++) {
			sum += tree[i] >= mid ? (tree[i] - mid) : 0;
		}
		return sum;
	}

}
