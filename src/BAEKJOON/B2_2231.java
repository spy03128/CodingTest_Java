package BAEKJOON;

import java.util.Scanner;



public class B2_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int x=10*(s.length()-1);x<Integer.parseInt(s);x++) {
			String temp = x+"";
			
			int [] arr = new int[temp.length()];
			
			for(int i=0;i<temp.length();i++) {
				arr[i] = temp.charAt(i)-'0';
			}
			
			int sum =Integer.parseInt(temp);
			
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			
			if(sum==Integer.parseInt(s)) {
				System.out.println(x);
				return;
			}
		}
		
		System.out.println("0");
		
		
		
	}
}
