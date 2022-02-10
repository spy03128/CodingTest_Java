package BAEKJOON;

import java.util.Scanner;

public class S3_9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //테스트 케이스
		int ex [] = new int[11];
		ex[0] = 1;
		ex[1] = 2;
		ex[2] = 4;
		
		for(int i=3;i<11;i++) {
			ex[i] = ex[i-1]+ex[i-2]+ex[i-3];
		}
		
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
	
			
			System.out.println(ex[num-1]);
		}
		
	}
}