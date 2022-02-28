package BAEKJOON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class S2_15664 {
	static int N,M;
	static int[] arr,result;
	static HashSet<String> list;

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		list = new LinkedHashSet<String>();
		N = sc.nextInt();
		M = sc.nextInt();
		arr= new int[N];
		result = new int[M];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		combi(0,0);
		for(String s:list) {
			
			System.out.println(s);
		}
		
	}
	private static void combi(int cnt, int start) {
		
		if(cnt==M) {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<M;i++) {
				sb.append(result[i]).append(" ");
			}
			
			
			
			
			list.add(sb.toString());
			
			
			return;
		}
		
		for(int i=start;i<N;i++) {
			result[cnt] = arr[i];
			combi(cnt+1,i+1);
		}
		
	}
}
