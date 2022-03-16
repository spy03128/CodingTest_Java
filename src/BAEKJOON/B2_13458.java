package BAEKJOON;

import java.util.Scanner;

public class B2_13458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt();
		int arr [] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		long num=0;
		for(int i=0;i<N;i++) {
			if(arr[i]<=B) num++;
			else {
				arr[i] -= B;
				num++;
				if(arr[i]%C ==0) {
					num += arr[i]/C;
				}else {
					num += arr[i]/C +1;
				}
				
			}
		}
		
		System.out.println(num);
		
	}
}
