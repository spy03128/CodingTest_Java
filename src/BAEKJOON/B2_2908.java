package BAEKJOON;

import java.util.Scanner;

public class B2_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String [] st = s.split(" ");
		
		
		
		int length = st[0].length();
		

		String newst = "";
		for (int j = length - 1; j >= 0; j--) {
			newst += st[0].charAt(j) +"";
		}
		
		length = st[1].length();

		String news = "";
		for (int j = length - 1; j >= 0; j--) {
			news += st[1].charAt(j) + "";
		}
		
		if(Integer.parseInt(newst)>Integer.parseInt(news)) {
			System.out.println(newst);
		}else {
			System.out.println(news);
		}
		
	}
}
