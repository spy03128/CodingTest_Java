package BAEKJOON;

import java.util.Scanner;
import java.util.regex.Pattern;

public class G4_9935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		String st = sc.nextLine();
//		String pattern = ".*"+st+".*";
//		
//
//		while(true) {
//			
//			if(Pattern.matches(pattern, s)) s = s.replace(st, "");
//			else {
//				if(s.length()==0) System.out.println("FRULA");
//				else System.out.println(s);
//
//				break;
//			}
//		}

		String[] s = sc.nextLine().split("");
		String t = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			sb.append(s[i]);
			if (sb.length() >= t.length()) {
				
				int sl = sb.length();
				int tl = t.length();
				
				if (sb.substring(sl - tl, sl).equals(t)) {
					sb.delete(sl - tl, sl);
				}
			} else {
				continue;
			}
		}
		System.out.println(sb.length() == 0 ? "FRULA" : sb);

	}
}
