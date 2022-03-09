package BAEKJOON;

import java.util.Scanner;

public class B2_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String st[] = s.split(" ");
		
		if(s.equals(" ")) {
			System.out.println("0");
		}else {
			int num = st.length;
			if(st[0].equals("")) num--;
			System.out.println(num);
			
		}
	}
}
