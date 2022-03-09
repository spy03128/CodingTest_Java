package BAEKJOON;

import java.util.Scanner;

public class B2_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			
			String s = sc.next();
			String newst = "";
			for(int j=0;j<s.length();j++) {
				for(int x=0;x<N;x++) {
					newst += s.charAt(j);
				}
			}
			
			System.out.println(newst);
		}
		
	}
}
