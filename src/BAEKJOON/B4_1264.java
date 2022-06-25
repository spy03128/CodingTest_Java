package BAEKJOON;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B4_1264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			
			if(s.equals("#")) break;
			
			String pattern = "(?i)[aeiou]";
			int count=0;
			for(int i=0;i<s.length();i++) {
				String temp = s.charAt(i)+"";
				if(Pattern.matches(pattern,temp)) count++;
			}
			
			System.out.println(count);
			
		}
	}
}
