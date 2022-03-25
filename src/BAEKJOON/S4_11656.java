package BAEKJOON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S4_11656 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String [] result = new String[s.length()];
		for(int i=0;i<s.length();i++) {
			String temp ="";
			for(int j=i;j<s.length();j++) {
				temp += s.charAt(j)+"";
			}

			result[i] = temp;
		}
		
		Arrays.sort(result,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+"\n");
		}
	
	}
}
