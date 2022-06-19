package BAEKJOON;

import java.util.Scanner;

public class B2_10953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<N;i++) {
			String[] s = sc.nextLine().split(",");
			System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
		}
	}
}
