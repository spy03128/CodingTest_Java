package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class S3_2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N  = sc.nextInt();
		
		int sum=0;
		
		int arr [] = new int[N];
		int odarr [] = new int[8001];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
			sum+= arr[i];
			odarr[arr[i]+4000]++;
		}
		double avg = (sum*1.0)/N;
		if(avg<0 && avg>-1) avg = 0;
		System.out.printf("%.0f\n",avg);
		
		
		Arrays.sort(arr);
		
		sb.append(arr[N/2]).append("\n");
		
		int max=0;
		int idx=0;
		for(int i=0;i<8001;i++) {
			if(odarr[i]>max) {
				max = odarr[i];
				idx = i;
			}
		}
		int num=0;
		for(int i=0;i<8001;i++) {
			if(odarr[i]==max) {
				num++;
				if(num==2) {
					sb.append(i-4000).append("\n");
					break;
				}
			}
		}
		
		if(num==1) sb.append(idx-4000).append("\n");
		
		sb.append(arr[N-1]-arr[0]);
		
		
		System.out.println(sb);
	}
}
