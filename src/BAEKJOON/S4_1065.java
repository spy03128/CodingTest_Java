package BAEKJOON;

import java.util.Scanner;

public class S4_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num=0;
		if(N<=99) num = N;
		else {
			num=99;
			
			for(int i=100;i<=N;i++) {
				String s = i+"";
				
				int ch = (s.charAt(0)-'0')-(s.charAt(1)-'0');
				for(int j=1;j<s.length()-1;j++) {
					if((s.charAt(j)-'0')-(s.charAt(j+1)-'0')!=ch) {
						break;
					}
					if(j==s.length()-2) num++;
				}
				
				
			}
			
		}
		
		System.out.println(num);
		
		
	}
}
