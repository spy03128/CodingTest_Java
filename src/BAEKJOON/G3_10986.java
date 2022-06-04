package BAEKJOON;

import java.util.Scanner;

public class G3_10986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long array[] = new long[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.nextLong()%M;
		}
		
		long sum[] = new long[N+1];
		long cnt=0;
		long module[] = new long[M];
		for(int i=1;i<=N;i++) {
			sum[i] += (sum[i-1]+array[i-1])%M;
			if(sum[i]==0) cnt++;
			module[(int) sum[i]]++;
		}

		
		for(int i=0;i<M;i++) {
			if(module[i]>1) {
				cnt += (module[i] * (module[i]-1))/2;
			}
		}
		
		
 		System.out.println(cnt);
		
		
	}
}
