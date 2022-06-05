package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_1654 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		long arr[] = new long[K];
		long mx = 0;
		for(int i=0;i<K;i++) {
			arr[i] = Long.parseLong(br.readLine());
			
			if(mx<arr[i]) mx = arr[i];
		}
		
		
		long start = 0;
		long end = mx;
		long cnt = 0;
		long max =0;
		while(true) {
			if(N==1) {
				max = mx;
				break;
			}
			if(start>end) {
				break;
			}
			long mid = (start+end) /2;
			if(mid==0) mid=1;
//			System.out.println("start: " +start);
//			System.out.println("end: " +end);
//			System.out.println("mid: " +mid);
			cnt = 0;
			for(int i=0;i<K;i++) {

//				System.out.print(arr[i]/mid+" ");
				cnt+= arr[i]/mid;
			}
//			System.out.println();
//			System.out.println(cnt);
			if(cnt<N) {
				end = mid-1;
			}else{
				if(mid>max) {
					max = mid;
				}
				start = mid+1;
			}
			
		}
		
		System.out.println(max);
		
		
	}
}
