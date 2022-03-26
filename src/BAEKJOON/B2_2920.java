package BAEKJOON;

import java.util.Scanner;

public class B2_2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = "";
		if(s.equals("1 2 3 4 5 6 7 8")) result = "ascending";
		else if (s.equals("8 7 6 5 4 3 2 1")) result = "descending";
		else result = "mixed";
		
		System.out.println(result);
	}
}
