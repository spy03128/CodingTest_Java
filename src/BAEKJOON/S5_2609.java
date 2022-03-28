package BAEKJOON;

import java.util.Scanner;

public class S5_2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		int num=0;
		//GCD(a,b) = GCD(b,r)
		if(x>y) {
			 num = gcd(x,y);
		}else {
			 num = gcd(y,x);
		}
		
		System.out.println(num);
		System.out.println(x*y/num);
	}

	private static int gcd(int x, int y) {
		if(y==0) return x;
		return gcd(y,x%y);
		
		
		
	}
}
