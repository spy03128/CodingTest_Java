package BAEKJOON;

import java.util.Scanner;
import java.util.regex.Pattern;

public class S5_15904 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String pattern = "(.)*U(.)*C(.)*P(.)*C(.)*";
		
		if(Pattern.matches(pattern, s)) System.out.println("I love UCPC");
		else System.out.println("I hate UCPC");
	}
}
