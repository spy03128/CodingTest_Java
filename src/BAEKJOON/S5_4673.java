package BAEKJOON;

public class S5_4673 {
	public static void main(String[] args) {

		boolean num[] = new boolean[10001];

		for (int i = 1; i <= 10000; i++) {
			String s = i + "";
			int sum = i;
			for (int j = 0; j < s.length(); j++) {
				sum += s.charAt(j) - '0';
			}

			if (sum <= 10000) {
				num[sum] = true;
			}

		}

		for (int i = 1; i <= 10000; i++) {
			if (num[i] == false) {
				System.out.println(i);
			}
		}

	}
}
