package BAEKJOON;

import java.util.Scanner;

public class B5_1550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int result = 0;
		//543210
		int num = s.length()-1;
		for(int i=0;i<s.length();i++) {
			int x = 1;
			for(int j=0;j<num;j++) {
				x *=16;
			}
			if(s.charAt(i)=='A') result += 10*x;
			else if(s.charAt(i)=='B') result += 11*x;
			else if(s.charAt(i)=='C') result += 12*x;
			else if(s.charAt(i)=='D') result += 13*x;
			else if(s.charAt(i)=='E') result += 14*x;
			else if(s.charAt(i)=='F') result += 15*x;
			else {
				result += (s.charAt(i)-'0')*x;
			}
			num--;
		}
		
		System.out.println(result);
	}
}
