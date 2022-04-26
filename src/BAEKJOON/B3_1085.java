package BAEKJOON;

import java.util.Scanner;

public class B3_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		
		
		int min = Math.min(x, y);
		int min2 = Math.min(Math.abs(w-x), Math.abs(h-y));
		int result = Math.min(min, min2);
		
		System.out.println(result);
		
		
	}
}
