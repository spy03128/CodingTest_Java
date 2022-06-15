package BAEKJOON;

import java.util.Scanner;

public class S5_2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		int sum = 1;
		int sidx = 1;
		int eidx = 1;
		int count =1;
		
		while(eidx!=N) {
			
			if(sum==N) {
				count++;
				eidx++;
				sum +=eidx;
			}
			else if(sum > N) {
				sum -=sidx;
				sidx++;
			}
			else if(sum < N) {
				eidx++;
				sum +=eidx;
			}
			
			
		}
		
		System.out.println(count);
	}
}
