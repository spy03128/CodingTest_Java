package BAEKJOON;

import java.util.Scanner;

public class S1_2343 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int sum=0;
		int max=0;
		
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) max = arr[i];
			sum += arr[i];
		}
		
		while(max<=sum) {
			
			int mid = (max+sum)/2;
			int count=0;
			int subsum=0;
			boolean check=false;
			for(int i=0;i<N;i++) {
				subsum+=arr[i];  
				
				if(subsum>mid) {
					count++;
					subsum=arr[i];
				}
			
			}
			if(subsum!=0) count++;
		
			
			
			if(count>M) {
				max = mid+1;
			}else  {
				sum = mid-1;
			}
			
		
		}
		
		System.out.println(max);
		
		
		
	}
}
