package BAEKJOON;

import java.util.Scanner;

public class S5_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N= sc.nextInt();
		sc.nextLine();
		int num=0;
		
		for(int i=0;i<N;i++) {
			String s = sc.nextLine();
			
			boolean check[] = new boolean[26];
			char start = s.charAt(0);
			check[s.charAt(0)-'a'] = true;
			
			boolean checkb = false;
			
			for(int j=1;j<s.length();j++) {
				if(check[s.charAt(j)-'a']==true ) {
					if(start!=s.charAt(j)) {
						checkb = true;
						break;
					}
				}
				
				check[s.charAt(j)-'a']=true;
				start = s.charAt(j);
			}
			
			if(checkb==false) num++;
			
		}
		System.out.println(num);
	}
}
