package BAEKJOON;

import java.util.Scanner;

public class B2_15829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int L = sc.nextInt();
		
		sc.nextLine();
		long sum=0;
		String s = sc.next();
		String[] arr = s.split("");
		long pow = 1;
		for(int i=0;i<L;i++) {
			char c = arr[i].charAt(0);
			long temp = c-'a'+1;
			sum += (temp*pow)%1234567891;
			pow = (pow*31)%1234567891;
	
		}

		System.out.println(sum%1234567891);
	}
}
