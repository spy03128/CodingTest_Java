package BAEKJOON;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class G2_1202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 보석
		int K = sc.nextInt(); // 가방

		int rubi[][] = new int[N][2];
		int bag[] = new int[K];

		for (int i = 0; i < N; i++) {
			rubi[i][0] = sc.nextInt();
			rubi[i][1] = sc.nextInt();
		}

		for (int i = 0; i < K; i++) {
			bag[i] = sc.nextInt();
		}

		Arrays.sort(rubi, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}

		});
		Arrays.sort(bag);

		PriorityQueue<Integer> priority = new PriorityQueue<>(Collections.reverseOrder());
		long result = 0; //최대값 계산했을 때 int값 넘어감

		int id = -1; // 시작할 값 인덱스
		
		for (int i = 0; i < K; i++) {
			int currentBag = bag[i];

			for (int x = id + 1; x < N; x++) {
				if (rubi[x][0] <= currentBag) {
					priority.add(rubi[x][1]);
					id = x;
				} else {
					break;
				}
			}

			if (priority.size() != 0) {
				result += priority.poll();
			}
	
		}

		System.out.println(result);

	}
}
