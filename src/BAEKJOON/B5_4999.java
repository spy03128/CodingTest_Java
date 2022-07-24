package BAEKJOON;

import java.util.Scanner;

public class B5_4999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String st = sc.nextLine();
		
		if(s.length()>=st.length()) System.out.println("go");
		else System.out.println("no");
		
	}
}
