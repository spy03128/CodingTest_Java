package BAEKJOON;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class S4_1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.nextLine();
		
		String [] arr = new String[n+m];
		
		for(int i=0;i<n+m;i++) {
			arr[i] = sc.nextLine();
		}
		
		Arrays.sort(arr);
		
		String temp = "";
		List<String> list = new LinkedList<>();
		temp = arr[0];
		for(int i=1;i<n+m;i++) {
			if(temp.equals(arr[i])) {
				list.add(arr[i]);
				
			}
			temp = arr[i];
		}
		
		
		int dx = 0;
		String [] result = new String[list.size()];
		
		for(String s : list) {
			result[dx++] = s;
		}
		
		
		Arrays.sort(result);
		
		System.out.println(result.length);
		for(int i =0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}
}
