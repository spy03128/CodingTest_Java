package BAEKJOON;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B2_10173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = ".*([nN][eE][mM][oO]).*";
		while(true) {
			String s = sc.nextLine();
			if(s.equals("EOI")) break;
			if(Pattern.matches(pattern, s)) System.out.println("Found");
			else System.out.println("Missing");
		}
	}
}
