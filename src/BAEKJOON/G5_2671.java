package BAEKJOON;

import java.util.Scanner;
import java.util.regex.Pattern;

public class G5_2671 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String pattern = "(10(0)+(1)+|01)+";
		
		String s = sc.nextLine();
		
		if(Pattern.matches(pattern, s)) System.out.println("SUBMARINE");
		else System.out.println("NOISE");
		
	}
}
