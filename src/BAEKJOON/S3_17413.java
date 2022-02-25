package BAEKJOON;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S3_17413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] s = sc.nextLine().split("");
		StringBuilder sb = new StringBuilder();

		List<String> list = new ArrayList<String>();
		boolean check = false;
		for (int i = 0; i < s.length; i++) {

			if (check == false && !s[i].equals("<")) {

				if(!s[i].equals(" "))list.add(s[i]);
			}

			if ((check == false && s[i].equals(" ")) || (check == false && s[i].equals("<"))) {
				while (list.size() > 0) {
					sb.append(list.get(list.size() - 1));
					list.remove(list.size() - 1);
				}
				if(s[i].equals(" ")) sb.append(" ");
				
			}

			if (s[i].equals("<")) {
				check = true;
				sb.append("<");
				continue;
			}
			if (s[i].equals(">")) {
				check = false;
				sb.append(">");
				continue;
			}
			if (check == true) {
				sb.append(s[i]);
				continue;
			}

			if (check == false && i == s.length - 1) {
				while (list.size() > 0) {
					sb.append(list.get(list.size() - 1));
					list.remove(list.size() - 1);
				}
				continue;
			}

		}

		System.out.println(sb);

	}
}
