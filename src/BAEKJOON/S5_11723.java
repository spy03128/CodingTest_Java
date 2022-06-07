package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S5_11723 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<>();
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			String s [] = br.readLine().split(" ");
			
			if(s[0].equals("add")) {
				set.add(s[1]);
			}else if(s[0].equals("remove")) {
				set.remove(s[1]);
			}else if(s[0].equals("check")) {
				if(set.contains(s[1])) {
					sb.append(1).append("\n");
				}else sb.append(0).append("\n");
			}else if(s[0].equals("toggle")) {
				if(set.contains(s[1])) {
					set.remove(s[1]);
				}else {
					set.add(s[1]);
				}
			}else if(s[0].equals("all")) {
				set.clear();
				for(int x=1;x<=20;x++) {
					set.add(x+"");
				}
			}else if(s[0].equals("empty")) {
				set.clear();
			}
		}
		
		System.out.println(sb);
	}
}
