package BAEKJOON;

import java.util.Scanner;

public class G5_2023 {
	static int[] number = {1,3,5,7,9};
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		//1~8
		
		DFS(2,1);
		DFS(3,1);
		DFS(5,1);
		DFS(7,1);
		
		
		
	}

	private static void DFS(int i, int n) {
		
		if(n == N) {
			System.out.println(i);
			return;
		}
		
		for(int x=0;x<5;x++) {
			int num = i * 10  + number[x];
			//소수인지 체크
			
			if(checkF(num)) {
				DFS(num,n+1);
			}
			
			
			
			
			
		}
		
	}

	private static boolean checkF(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) return false;
		}
		return true;
		
	}
}
