package BAEKJOON;

import java.util.Scanner;

public class S5_1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int num=0;
		int x = 665;
		while(true) {
			if(num==N) {
				System.out.println(x);
				break;
			}
			x++;
			String numst = x+"";

			if(numst.contains("666")) {
				num++;
			}
		}
		
	}
}
