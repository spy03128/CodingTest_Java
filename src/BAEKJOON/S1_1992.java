package BAEKJOON;


import java.util.Scanner;

public class S1_1992 {
	public static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		int map[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = s.charAt(j)-48;
				
			}
		}

		divide(N, 0, 0, map);
	}

	public static void divide(int n, int x, int y, int map[][]) {
		int partLen = n / 2;
		if (n == 0) {
			return;
		}

		int check = map[x][y];
		boolean recu = false;
		
		f: for (int i = x; i < x+n; i++) {
			for (int j = y; j < y+n; j++) {
				if (map[i][j] != check) {
					recu = true;
					break f;
				} 

			}
		}

		if (recu) {
			System.out.print("(");
			divide(partLen, x, y, map); //0 0
			divide(partLen, x, y + partLen, map); //0 4
			divide(partLen, x + partLen, y, map); //4 0 
			divide(partLen, x + partLen, y + partLen, map); // 4 4
			System.out.print(")");
		}else {
			System.out.print(check);
		}
	}
}
