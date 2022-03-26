package BAEKJOON;

import java.util.Scanner;

public class S4_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sum=0;
		for(int i=0;i<N;i++) {
			int x = sc.nextInt();
			
			if(x==1) {
				continue;
			}
			
			boolean check = false;
			for(int j=2;j<x;j++) {
				if(x%j==0) {
					check = true;
					break;
				}
			}
			if(check==false) sum++;
			
		}
		
		System.out.println(sum);
	}
}
