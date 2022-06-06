package BAEKJOON;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class S3_9375 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int t=0;t<tc;t++) {
			int n = sc.nextInt();
			sc.nextLine();
			String[] arr = new String[n];
			for(int i=0;i<n;i++) {
				String s = sc.nextLine();
				String [] temp = s.split(" ");
				arr[i]  = temp[1];
			}
			
			
			
			Arrays.sort(arr);
			
			List<Integer> list = new LinkedList<>();
		
			
		
			int cnt = 0;
			String st = "";
			for(int i=0;i<n;i++) {
				if(i==0){
					st = arr[0];
					cnt = 1;
				}else {
					if(st.equals(arr[i])) {
						cnt++;
					}else {
						list.add(cnt);
						cnt = 1;
						st = arr[i];
						
					}
				}
				if(i==n-1) list.add(cnt);
			}
			
			
		
			int sum=1;
			for(int x : list) {
				sum*=(x+1);
			}
			System.out.println(sum-1);
		
			
			
			
		}
		
		
		
	}
}
