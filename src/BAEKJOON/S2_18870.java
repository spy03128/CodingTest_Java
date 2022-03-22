package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S2_18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Set<Integer> set = new HashSet<Integer>();
		int scarr[] = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			scarr[i] = Integer.parseInt(st.nextToken());
			set.add(scarr[i]);
		}
		int arr[] = new int[set.size()];
		int n = 0;
		for (int x : set) {
			arr[n] = x;
			n++;
		}

		Arrays.sort(arr); //nlogn

		for (int i = 0; i < N; i++) { //이분탐색 logn * for문 n => nlogn
			
			int start = 0;
			int end = arr.length;
			int mid = end /2;
			while (true) {
				if (scarr[i] <arr[mid] ) { //왼쪽
					end = mid;
					mid = end /2;
				}else if (scarr[i] >arr[mid] ){ //오른쪽
					start = mid+1;
					mid = start + ((end-start) /2);
				}else {
					sb.append(mid).append(" ");
					
					break;
				}
			}

			
		}

		System.out.println(sb);

	}
}
