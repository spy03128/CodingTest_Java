package BAEKJOON;

import java.util.Scanner;

public class B5_10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		
		int len = 0;
		int[] Aarr;
		int[] Barr;
		if(A.length()>=B.length()) {
			len = A.length();
			Aarr = new int[len];
			Barr = new int[len];
			
			for(int i=0;i<A.length();i++) {
				Aarr[i] = A.charAt(i) - '0';
			}
			
			int x =0;
			for(int i=len-B.length();i<len;i++) {
				Barr[i] = B.charAt(x) - '0';
				x++;
			}
			
		}
		else {
			len = B.length();
			Aarr = new int[len];
			Barr = new int[len];
			
			
			for(int i=0;i<B.length();i++) {
				Barr[i] = B.charAt(i) -'0';
			}
			
			int x =0;
			for(int i=len-A.length();i<len;i++) {
				Aarr[i] = A.charAt(x) -'0';
				x++;
			}
		}
		
	
		
		int sum[] = new int[len];
		
		for(int i=len-1; i>=0;i--) {
			sum[i] = Aarr[i] + Barr[i];
			if(sum[i]>=10) {
				sum[i] = sum[i]-10;
				if(i!=0) Aarr[i-1] = Aarr[i-1]+1;
				else System.out.print("1");
			}
		}
		
		

		for(int i=0;i<len;i++) {
			System.out.print(sum[i]);
			

		}
		
		
	}
}
