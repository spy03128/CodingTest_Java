package BAEKJOON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S5_10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		String arr[][] = new String[N][3];
		for(int i=0;i<N;i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
			arr[i][2] = i+"";
		}
		
		Arrays.sort(arr, new Comparator<String []>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				if((int)Integer.parseInt(o1[0])==(int)Integer.parseInt(o2[0])){
					return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
				}
				return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
			}
			
		});
		
		for(int i=0;i<N;i++) {
			sb.append(arr[i][0]).append(" ");
			sb.append(arr[i][1]).append("\n");
			
		}
		
		System.out.println(sb);
		
	}
}
