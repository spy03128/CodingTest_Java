package BAEKJOON;

import java.util.Scanner;
import java.util.regex.Pattern;

public class S3_9342 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = "[A-F]{0,1}A+F+C+[A-F]{0,1}";
		
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sc.nextLine();
		for(int i=0;i<N;i++) {
			String s =sc.nextLine();
			if(Pattern.matches(pattern, s)) {
				sb.append("Infected!").append("\n");
			}else sb.append("Good").append("\n");
		}
		System.out.println(sb);
	}
}
