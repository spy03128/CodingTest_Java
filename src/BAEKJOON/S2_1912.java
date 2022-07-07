package BAEKJOON;

import java.util.Scanner;

public class S2_1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int D[] = new int[n+1];
		
		int max=-1001;
		for(int i=n-1;i>=0;i--) {
			D[i] = Math.max(arr[i],D[i+1]+arr[i]);
			if(D[i]>max)max=D[i];
			
		}
		
		System.out.println(max);
		
		
	}
}
