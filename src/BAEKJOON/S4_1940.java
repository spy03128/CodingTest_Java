package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class S4_1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sidx = 0;
		int eidx = arr.length-1;
		int count=0;
		
		while(true) {
			if(sidx==eidx) break;
			
			int sum = arr[sidx]+arr[eidx];
			
			if(sum==M) {
				count++;
				eidx-=1;
			}else if(sum > M) {
				eidx-=1;
				
			}else if(sum < M) {
				sidx+=1;
			}
		}
		
		System.out.println(count);
	}
}
