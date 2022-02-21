package BAEKJOON;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S5_2635 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> relist = new ArrayList<Integer>();

		int N = sc.nextInt();
		int max = 0;
		int num=2;
		
	
		
		for(int i=N;i>=N/2;i--) {
			list.add(N);
			int M = i;
			list.add(M);
			num =2;
			
			int result = N-M;
			
			while(result>0) {
				list.add(result);
				num++;
				int temp = result;
				result = M-result;
				M = temp;
			}
			if(num>max) {
				max = num;
	
				relist.clear();
				relist.addAll(list);
				
			}
				list.clear();
			
		}
		System.out.println(max);
		for(int x=0;x<relist.size();x++) {
		System.out.print(relist.get(x)+" ");}
	}
}
