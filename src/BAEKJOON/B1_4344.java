package BAEKJOON;

import java.util.Scanner;

public class B1_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++){
			int N = sc.nextInt();
			int arr [] = new int[N];
			int sum=0;
			for(int j=0;j<N;j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			double avg = sum/N;
			int num=0;
			for(int j=0;j<N;j++) {
				if(arr[j]>avg) num++;
			}
			
			System.out.printf("%.3f%%\n",((double)(num*1.0/N))*100);
			
		}
	}
}
