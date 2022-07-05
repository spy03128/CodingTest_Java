package BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

public class S1_1747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[10000001];
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i;
		}
		arr[1] = 0;
		
		for(int i=2;i<=Math.sqrt(10000001);i++) {
			if(arr[i]==0) continue;
			for(int j=i*i;j<10000001;j=j+i) {
				arr[j] = 0;
			}
		}
		

		
		for(int i=n;i<10000001;i++) {
			if(arr[i]!=0) {
				list.add(i+"");
			}
		}
		
		for(String s:list) {
			
				int start =0;
				int end = s.length()-1;
				boolean not = false;
				while(start<end) {
					if(s.charAt(start)==s.charAt(end)) {
						start++;
						end--;
					}else {
						not = true;
						break;
					}
				}
				
				if(!not) {
					System.out.println(s);
					break;
				}
				
				
			}
		
		
	}
}
