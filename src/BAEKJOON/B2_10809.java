package BAEKJOON;

import java.util.Scanner;

public class B2_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int arr [] = new int[26];
		
		for(int i=0;i<26;i++) {
			arr[i] = -1;
		}
		
		for(int i=0;i<s.length();i++) {
			if(arr[s.charAt(i)-'a']==-1) {
				arr[s.charAt(i)-'a'] = i;
		
			}
		}
		
		for(int i=0;i<26;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
