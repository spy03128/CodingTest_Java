package BAEKJOON;

import java.util.Scanner;
import java.util.regex.Pattern;

public class G5_1013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = "(10(0)+(1)+|01)+";
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<N;i++) {
			String s = sc.nextLine();
			if(Pattern.matches(pattern, s)) sb.append("YES").append("\n");
			else sb.append("NO").append("\n");
		}
		
		System.out.println(sb);
	}
}
