package BAEKJOON;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S5_2628 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		int x = sc.nextInt();

		int N = sc.nextInt();
		int max =0;
		ArrayList<Integer> xal = new ArrayList<>();
		ArrayList<Integer> yal = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int check = sc.nextInt();
			int num = sc.nextInt();

			if (check == 0) {
				xal.add(num);
			} else {
				yal.add(num);
			}
		}
		
		Collections.sort(xal);
		Collections.sort(yal);
		
		xal.add(0, 0);		xal.add(x);
		yal.add(0, 0);		yal.add(y);
		
		for(int i=0;i<xal.size()-1;i++) {
			for(int j=0; j<yal.size()-1;j++) {
				int result = (xal.get(i+1)-xal.get(i)) * (yal.get(j+1)-yal.get(j));
				
				if(result>max) max = result;
				
				
			}
		}
		System.out.println(max);

	}
}
