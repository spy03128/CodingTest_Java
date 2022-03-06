package BAEKJOON;

import java.util.Scanner;

public class S1_1527 {
	static int num[],result[];
	static int number=0;
	static String A,B;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 A = sc.next();
		 B = sc.next();
		 
	
		
		num = new int[2];
		num[0] = 4; num[1] = 7;
		int Alen = A.length();
		int Blen = B.length();
		result = new int[Blen];
		
		for(int i=Alen;i<=Blen;i++) {
			permu(0,i);
		}
		
		
		System.out.println(number);
	}

	private static void permu(int cnt, int len) {
		if(cnt==len) {
			String s ="";
			for(int i=0;i<cnt;i++) {
				s +=result[i];
			}
			if(Long.parseLong(s)>=Long.parseLong(A) && Long.parseLong(s) <=Long.parseLong(B)) {
				number++;
			}
			return;
		}
		
		for(int i=0;i<2;i++) {
			result[cnt]=num[i];
			permu(cnt+1,len);
		}
		
	}
}
