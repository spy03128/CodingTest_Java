package BAEKJOON;

import java.util.Scanner;

public class B1_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		//65~90 A~Z
		//97~122 a~z
		
		int arr[] = new int[26];
		
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90) {
				arr[s.charAt(i)-'A']++;
			}
			if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122) {
				arr[s.charAt(i)-'a']++;
			}
		}
		
		int max =0;
		int result = 0;
		for(int i=0;i<26;i++) {
			if(arr[i]>max) {
				max = arr[i];
				result = i;
			}
		}
		int num=0;
		for(int i=0;i<26;i++) {
			if(arr[i]==max) {
				num++;
			}
		}
		
		if(num>1) {
			System.out.println("?");
		}else {
			
			System.out.println((char)('A'+result));
		}
		
		
	}
}
