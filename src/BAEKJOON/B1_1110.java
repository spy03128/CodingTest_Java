package BAEKJOON;

import java.util.Scanner;

public class B1_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.nextLine();
		
		if(Integer.parseInt(N)<=9) {
			N = "0" + N;
		}
		
		String s = N;
		int num=0;
		while(true) {
			String nNum = ((s.charAt(0)-'0') + (s.charAt(1) -'0'))+ "";
			if(nNum.length()==2) nNum = nNum.substring(1);
	
			s = s.substring(1) + nNum;
			
			
			num++;
			
			if(s.equals(N)) break;
			
		}
		
		System.out.println(num);
		
		
	}
}
