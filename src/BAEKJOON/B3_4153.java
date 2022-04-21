package BAEKJOON;

import java.util.Scanner;

public class B3_4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==0 && b==0 && c==0) break;
			sum = (a*a)+(b*b)+(c*c);
			
			int temp = Math.max(a, b);
			
			temp = Math.max(temp, c);
			
			sum = sum-(temp*temp);
			
			if(sum==(temp*temp)) System.out.println("right");
			else System.out.println("wrong");
			
		}
		
		
	}
}
