package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class S4_1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		int narr [] = new int[N];
		
		for(int i=0;i<N;i++) {
			narr[i] = sc.nextInt();
			
		}
		
		Arrays.sort(narr); //오름차순
		
		int M  = sc.nextInt();
		
		for(int i=0;i<M;i++) {
			int x = sc.nextInt();
			
			int start = 0; 
			int end = N-1;
			int mid = 0;
			
			mid = N/2;
			while(true) {
				
				if(x<narr[mid]) {
					end = mid;
					mid = end/2;
				}else if(x==narr[mid]) {
					sb.append("1").append("\n");
					break;
				}else {
					start = mid+1;
					mid = start+ (end-start)/2;
				}
				
				if(start==end) {
					if(x==narr[start]) sb.append("1").append("\n");
					else sb.append("0").append("\n");
					break;
				}
			}
			
			
			
		}
		
		
		System.out.println(sb);
	}
}
