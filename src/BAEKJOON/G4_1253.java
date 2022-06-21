package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class G4_1253 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int count=0;
		for(int i=0;i<N;i++) {
			int s = 0;
			int e = N-1;
			
			while(true) {
				if(s==e) break;
				if(s==i) {
					s++;
					continue;
				}
				if(e==i) {
					e--;
					continue;
				}
				if(arr[s]+arr[e]==arr[i]) {		
					count++;
					break;			
				}else if(arr[s]+arr[e]>arr[i]) {
					e--;
				}else if(arr[s]+arr[e]<arr[i]) {
					s++;
				}

			}

			
		}
		
		System.out.println(count);
		
		
	}
}
