package BAEKJOON;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class S2_5567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt=0;
		
		boolean friend[][] = new boolean[n+1][n+1];
		boolean list[] = new boolean[n+1];
		List<Integer> slist = new LinkedList<>();
		
		
		for(int i=0;i<m;i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
		
			friend[s][e] = true;
			friend[e][s] = true;
			
		}
		

		list[1]=true;
		
		
		for(int i=0;i<=n;i++) {
			if(friend[1][i]) {
				list[i] = true; 
				slist.add(i);
			}
		}
		
	
		
		
		for(int i=0;i<slist.size();i++) {
			
			for(int j=2;j<=n;j++) {
				if(friend[slist.get(i)][j]) list[j] = true; 
					
			}
				
			
			
		}
		
		
		for(int i=0;i<=n;i++) {
			if(list[i]) cnt++; 
			
		}
		
		
		
		 System.out.println(cnt-1);
		
		
		
		
	}
}
