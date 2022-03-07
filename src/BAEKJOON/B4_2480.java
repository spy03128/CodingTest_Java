package BAEKJOON;

import java.util.Scanner;

public class B4_2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int money = 0;
		int max = 0;
		
		if(a==b) {
			if(b==c) {
				//세개다 같은 눈
				money = 10000+(a*1000);
			}else {
				//두개 같은 눈
				money = 1000+(a*100);
			}
		}else {
			if(b==c) {
				//두개 같은 눈
				money = 1000+(b*100);
			}
			else if(a==c) {
				//두개 같은 눈
				money = 1000+(a*100);
			}
			else {
				//세개 다 다른 눈
				if(a>b) max = a;
				else max = b;
				
				if(max<c) max =c;
				
				money = max*100;
				
			}
		}
		
		System.out.println(money);
		
		
	}
}
