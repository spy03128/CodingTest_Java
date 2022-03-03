package BAEKJOON;

import java.util.Scanner;

public class S2_1535 {
	static int[] L, J;
	static int N;
	static boolean[] isSelected;
	static int max=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		L = new int[N];
		J = new int[N];
		isSelected = new boolean[N];

		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			J[i] = sc.nextInt();
		}
		
		combi(0);
		
		System.out.println(max);

	}

	private static void combi(int cnt) {

		if(cnt==N) {
			int sum=0;
			int ep=100;
			for(int i=0;i<N;i++) {
				if(isSelected[i]) {
					ep-=L[i];
					sum+=J[i];
				}
				if(ep>0 && sum>max) {
					max =sum;
				}
			}
			return;
		}
		
		// 현재 원소를 선택
		isSelected[cnt] = true;
		combi(cnt+1);
		// 현재 원소를 비선택
		isSelected[cnt] = false;
		combi(cnt+1);
		
	}
}
