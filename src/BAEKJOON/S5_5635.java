package BAEKJOON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S5_5635 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String s[][] = new String[n][4];
		for(int i=0;i<n;i++) {
			String st = sc.nextLine();
			
			s[i] = st.split(" ");
			
			
		}

		
		
		
		Arrays.sort(s,new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if(Integer.parseInt(o1[3])==Integer.parseInt(o2[3])) {
					if(Integer.parseInt(o1[2])==Integer.parseInt(o2[2])) {
						return Integer.parseInt(o1[1])-Integer.parseInt(o2[1]);
					}
					return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
				}
				return Integer.parseInt(o1[3])-Integer.parseInt(o2[3]);
			}
			
			
		});
		

		System.out.println(s[n-1][0]);
		System.out.println(s[0][0]);
		
	}
}
