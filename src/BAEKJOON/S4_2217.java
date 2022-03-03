package BAEKJOON;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S4_2217 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max =0;
		int N = sc.nextInt();
		Integer[] arr = new Integer[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i=0;i<N;i++) {
			int sum=0;
			sum = arr[i]*(i+1);
			if(sum>max) max=sum;
		}
		
		System.out.println(max);
		
	}
	
}
