package JUNGOL;

import java.util.Scanner;

public class S_559 {
	public static void main(String[] args) {
		double[] score = new double[]{85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.printf("%.1f",score[x-1]+score[y-1]);
	}
}
