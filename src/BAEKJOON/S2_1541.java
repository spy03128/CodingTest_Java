package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

public class S2_1541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String temp = "";
		int sum =0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='+') {
				sum+= Integer.parseInt(temp);
				temp = "";
			}else if(s.charAt(i)=='-') {
				sum+= Integer.parseInt(temp);
				list.add(sum);
				temp ="";
				sum=0;
			}else {
				temp+=s.charAt(i);
			}
			
			if(i==s.length()-1) {
				sum+= Integer.parseInt(temp);
				list.add(sum);
			}
			
			
		}
		
		if(list.size()==0) System.out.println(sum);
		else {
			int result = list.get(0);
			for(int x : list) {
				result -= x;
			}
			System.out.println(result+list.get(0));
		}
	}
}
