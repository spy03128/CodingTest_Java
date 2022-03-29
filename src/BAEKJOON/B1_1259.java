package BAEKJOON;

import java.util.Scanner;

public class B1_1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();	
			if(s.equals("0")) break;
			
			String backs = "";
			for(int i=s.length()-1;i>=0;i--)
			{
				backs += s.charAt(i)+"";
			}
		

			
			
			if(s.equals(backs)) System.out.println("yes");
			else System.out.println("no");
			
			
		}
	}
}
