package BAEKJOON;

import java.util.Scanner;

public class S5_1769 {
	static int count = 0;
	static int sum = 0;

	public static int recur(String num) {
		sum =0;

		for (int i = 0; i < num.length(); i++) {
			sum += num.charAt(i) - '0';

		}

		if (num.length() == 1)
			return sum;

		count++;
		
		String newnum = sum + "";

		return recur(newnum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String num = sc.nextLine();
		String result = "NO";

		sum = recur(num);
		if (sum != 0 && sum % 3 == 0)
			result = "YES";
		
		  System.out.println(count); System.out.println(result);
		 

	}

}
