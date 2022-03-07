package BAEKJOON;

import java.util.Scanner;

public class B4_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		M += C;
		
		if(M<60) {
			System.out.printf("%d %d", H, M);
		}else {
			H = H + (M/60);
			M = M%60;
			if(H>=24) H=H%24;
			System.out.printf("%d %d", H, M);
		}
		
		
	}
}
