package BAEKJOON;

import java.util.Scanner;

public class S3_3085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		char candy[][] = new char[N][N];

		int max = 0;

		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			candy[i] = s.toCharArray();
		}

		// 열개수세기
		for (int i = 0; i < N; i++) {
			char start = candy[i][0];
			int num = 1;
			for (int j = 1; j < N; j++) {
				if (start == candy[i][j]) {
					num++;
					if (num > max)
						max = num;
				} else {
					start = candy[i][j];
					num = 1;
				}

			}

		}

		// 행개수세기
		for (int j = 0; j < N; j++) {
			char start = candy[0][j];
			int num = 1;
			for (int i = 1; i < N; i++) {
				if (start == candy[i][j]) {
					num++;
					if (num > max)
						max = num;
				} else {
					start = candy[i][j];
					num = 1;
				}

			}

		}
		

		// 열바꾸기
		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N - 1; j++) {
				char temp = candy[i][j];
				candy[i][j] = candy[i][j + 1];
				candy[i][j + 1] = temp;

				char start = candy[i][0];
				int num = 1;
				// 열검사
				for (int x = 1; x < N; x++) {
					if (start == candy[i][x]) {
						num++;
						if (num > max)
							max = num;
					} else {
						start = candy[i][x];
						num = 1;
					}

				}

				// 행검사
				start = candy[0][j];
				num = 1;
				for (int x = 1; x < N; x++) {
					if (start == candy[x][j]) {
						num++;
						if (num > max)
							max = num;
					} else {
						start = candy[x][j];
						num = 1;
					}

				}

				start = candy[0][j + 1];
				num = 1;
				for (int x = 1; x < N; x++) {
					if (start == candy[x][j + 1]) {
						num++;
						if (num > max)
							max = num;
					} else {
						start = candy[x][j + 1];
						num = 1;
					}

				}

				temp = candy[i][j];
				candy[i][j] = candy[i][j + 1];
				candy[i][j + 1] = temp;
			}
			

		}

		// 행바꾸기
		for (int j = 0; j < N; j++) {

			for (int i = 0; i < N - 1; i++) {
				char temp = candy[i][j];
				candy[i][j] = candy[i+1][j];
				candy[i+1][j] = temp;
				
			
				
				char start = candy[i][0];
				int num = 1;
				// 열검사
				for (int x = 1; x < N; x++) {
					if (start == candy[i][x]) {
						num++;
						if (num > max)
							max = num;
					} else {
						start = candy[i][x];
						num = 1;
					}

				}
				
				 start = candy[i+1][0];
				 num = 1;
				// 열검사
				for (int x = 1; x < N; x++) {
					if (start == candy[i+1][x]) {
						num++;
						if (num > max)
							max = num;
					} else {
						start = candy[i+1][x];
						num = 1;
					}

				}

				// 행검사
				start = candy[0][j];
				num = 1;
				for (int x = 1; x < N; x++) {
					if (start == candy[x][j]) {
						num++;
						if (num > max)
							max = num;
					} else {
						start = candy[x][j];
						num = 1;
					}

				}

				temp = candy[i][j];
				candy[i][j] = candy[i+1][j];
				candy[i+1][j] = temp;
			}
			

		}

		System.out.println(max);

	}
}
