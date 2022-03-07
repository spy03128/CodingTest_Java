package BAEKJOON;

import java.util.Scanner;

public class B3_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M<45) {
			if(H==0) H=23;
			else H -=1;
			
			M = 15+M;
		}else {
			M-=45;
		}
		
		System.out.printf("%d %d",H,M);
	}
}
