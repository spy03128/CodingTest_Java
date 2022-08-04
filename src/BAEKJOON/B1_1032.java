package BAEKJOON;

import java.util.Scanner;

public class B1_1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String [] str = new String[N];
		for(int i=0;i<N;i++) {
			str[i] = sc.nextLine();
		}
		int leng = str[0].length();
		for(int i=0;i<leng;i++) {
			char temp = str[0].charAt(i);
			boolean check = false;
			for(int j=1;j<N;j++) {
				if(temp!=str[j].charAt(i)) {
					sb.append("?");
					check = true;
					break;
				}
			}
			if(!check)sb.append(temp);
		}
		System.out.println(sb);
	}
}
