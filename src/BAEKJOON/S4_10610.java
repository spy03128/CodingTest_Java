package BAEKJOON;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S4_10610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.nextLine();
		
		long sum=0;
		Integer[] arr = new Integer[s.length()];
		boolean check = false;
		for(int i=0;i<s.length();i++) {
			arr[i] = s.charAt(i)-'0';
			sum= sum+ (s.charAt(i)-'0');
			if(s.charAt(i)=='0') check = true;
		}
		
		if(check) {
			if(sum%3!=0) System.out.println(-1);
			else {
				Arrays.sort(arr,Collections.reverseOrder());
			}
			for(int i=0;i<arr.length;i++) {
				sb.append(arr[i]);
			}
			
			System.out.println(sb);
		}else System.out.println(-1);
		

		
	}
}
