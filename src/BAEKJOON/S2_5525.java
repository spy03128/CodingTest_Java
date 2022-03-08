package BAEKJOON;

import java.util.Scanner;

public class S2_5525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();

		int num = 0;

		String s = sc.nextLine();
	

		String sub = "";
		for (int i = 0; i <= N; i++) {
			sub += "I";
			if (i != N)
				sub += "O";
		}

		
		for (int i = 0; i < s.length() - sub.length(); i++) {
			if(s.charAt(i)=='O') continue;
			if(s.charAt(i)=='I' && s.charAt(i+1)=='I') continue;
			if (s.substring(i, i+sub.length()).equals(sub)) {
				num++;
				
			}

		}
		System.out.println(num);
		
		

	}
}
