package BAEKJOON;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S4_1620 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		Map<Integer, String> map = new HashMap<>();
		Map<String, Integer> mapnum = new HashMap<>();
		sc.nextLine();
		for(int i=0;i<N;i++) {
			String s = sc.nextLine();
			map.put(i+1, s);
			mapnum.put(s, i+1);
		}
		
		for(int i=0;i<M;i++) {
			String temp = sc.nextLine();
			if(temp.charAt(0)-'0'>=0 && temp.charAt(0)-'0'<=9) {
				sb.append(map.get(Integer.parseInt(temp))).append("\n");
			}else {
				
				sb.append(mapnum.get(temp)).append("\n");
					
				
				
			
			
			
			}
		}
		
		System.out.println(sb);
		
		
	}
}
