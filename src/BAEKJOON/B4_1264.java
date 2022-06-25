package BAEKJOON;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B4_1264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			
			if(s.equals("#")) break;
			
//			String pattern = "(?i)[aeiou]";
			int count=0;
//			for(int i=0;i<s.length();i++) {
//				String temp = s.charAt(i)+"";
//				if(Pattern.matches(pattern,s)) count++;
//			}
//			

			
			Pattern pattern = Pattern.compile("(?i)[aeiou]");
			Matcher matcher = pattern.matcher(s);
			
			while(matcher.find()) {
				count++;
			}
			
			System.out.println(count);
			
			
		}
	}
}
