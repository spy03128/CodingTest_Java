package BAEKJOON;

import java.util.Scanner;

public class B5_2744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				sb.append((char)(s.charAt(i)+32));
			}else {
				sb.append((char)(s.charAt(i)-32));
			}
		}
		
		System.out.println(sb);
	}
}
