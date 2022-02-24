package BAEKJOON;

import java.util.Scanner;

public class S5_2941_크로아티아알파벳 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().replace("s=", "*");
		
		System.out.println(s.replace("s=", "*").replace("c=", "*").replace("c-", "*").replace("dz=", "*").replace("d-", "*").replace("lj", "*").replace("nj", "*").replace("z=", "*").length());
	}
}
