package BAEKJOON;

import java.util.Scanner;

public class B3_10250 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i=0; i<tc;i++) {
			
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int y = (N-1)/H + 1;
			int x = N%H;
			
			if(x==0) x= H;
			
			String sx =x+"";
			String sy ="";
			
		
			if(y<10) {
				 sy = "0"+y;
			}else {
				 sy = y+"";
			}
			
			
			
			System.out.println(sx+sy);
			
			
			
		}
		
		
		
	}
}
