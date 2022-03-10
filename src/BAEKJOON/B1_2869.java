package BAEKJOON;

import java.util.Scanner;

public class B1_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A= sc.nextInt();
		int B= sc.nextInt();
		int V= sc.nextInt();
		
		int day = A - B;
		int sum = V - A;
		
		int result = sum/day;
		if(sum%day != 0 ) result +=1;
		
		System.out.println(result+1);
	}
}
