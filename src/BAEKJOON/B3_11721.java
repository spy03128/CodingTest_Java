package BAEKJOON;

import java.util.Scanner;

public class B3_11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		int x = 0;
		W : while(true) {
			
			for(int i=0;i<10;i++) {
				if(x+i==S.length()) break W;
				System.out.print(S.charAt(x+i));
			}
			
			x+=10;
			System.out.println();	
		}
		
		
	}
}
