package BAEKJOON;

import java.util.Scanner;

public class S2_5525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();

		int num = 0;
		int result =0;
		
		String s = sc.nextLine();
	

		for(int i=0;i<M-2;i++) {
			if(s.charAt(i)=='I' && s.charAt(i+1)=='O' && s.charAt(i+2)=='I') {
				num++;
				if(num==N) {
					result++;
					num--;
				}
				i+=1;
			}else {
				num=0;
			}
			
		}
		
		System.out.println(result);
		

	}
}
