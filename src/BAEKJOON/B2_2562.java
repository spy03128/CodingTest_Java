package BAEKJOON;

import java.util.Scanner;

public class B2_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[10];
		int max = 0;
		int maxIx = 0;
		
		for(int i=1;i<=9;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) {
				max= arr[i];
				maxIx = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxIx);
		
		
		
	}
}
