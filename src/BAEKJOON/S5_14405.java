package BAEKJOON;

import java.util.Scanner;
import java.util.regex.Pattern;

public class S5_14405 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String pattern = "(pi|ka|chu)*";
		
		if(Pattern.matches(pattern, s)) {
			System.out.println("YES");
		}else System.out.println("NO");
		
	}
}
