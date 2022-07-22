package BAEKJOON;

import java.util.Scanner;

public class B2_2954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			char x = s.charAt(i);
			
			if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u') {
			
				s = s.substring(0, i+1) + s.substring(i+3);
			}
			
		}
		System.out.println(s);
	}
}
