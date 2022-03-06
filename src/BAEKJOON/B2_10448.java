package BAEKJOON;

import java.util.Scanner;

public class B2_10448 {
	static int result[],T[];
	static boolean check = false;
	static int K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = new int[46];
		
		
		
		for(int i=1;i<=45;i++) {
			for(int x=1;x<=i;x++) {
				T[i] +=x;
			}
		}
		
		result = new int[3];
		
		
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			K = sc.nextInt();
			
			combi(0);
			
			if(check==true) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
			check = false;
		}
	}

	private static void combi(int cnt) {
		if(cnt==3) {
			int sum=0;
			for(int i=0;i<3;i++) {
				sum += result[i];
			}
			if(sum==K) {
				check = true;
			}
			return;
		}
		
		for(int i=1;i<=45;i++) {
			result[cnt] = T[i];
			combi(cnt+1);
			
		}
		
	}
}
