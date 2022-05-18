package BAEKJOON;

import java.util.Scanner;

public class B3_2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		for(int i = 1; i <= n; i++) {

		      for(int j = i; j < n; j++) {
		        System.out.print(" ");
		      }

		      for(int k = 0; k < i*2-1; k++) {
		        System.out.print("*");
		      }

		      System.out.println();
		    }
	}
}
