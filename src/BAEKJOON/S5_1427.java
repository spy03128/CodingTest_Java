package BAEKJOON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S5_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.nextLine();
		
		Integer [] arr = new Integer[N.length()];
		
		for(int i=0; i<N.length();i++) {
			arr[i] = N.charAt(i)-'0';
		}
		
		Arrays.sort(arr,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		
		
		for(int i=0; i<N.length();i++) {
			System.out.print(arr[i]);
		}
		
	}
}
