package BAEKJOON;

import java.util.Scanner;

public class B2_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		int result =1;
		
		int i=1;
		
	
		while(true) {
			if(N==1) break;
			if(i>=N) break;
			
			
			i= i+(6*result);
			result ++;
			
			
			
		}
		System.out.println(result);
	}
}
