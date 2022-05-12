package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S4_10825 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int N = sc.nextInt();
		int N = Integer.parseInt(br.readLine());
		//sc.nextLine();
		
		String Stu[][] = new String[N][4];
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			//String s = sc.nextLine();
			//Stu[i] = s.split(" ");
			for(int j=0;j<4;j++) {
				Stu[i][j] = st.nextToken();
			}
			
		}
		
		Arrays.sort(Stu,new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if(Integer.parseInt(o1[1])==Integer.parseInt(o2[1])) {
					if(Integer.parseInt(o1[2])==Integer.parseInt(o2[2])) {
						if(Integer.parseInt(o1[3])==Integer.parseInt(o2[3])) {
							return o1[0].compareTo(o2[0]);
						}
						
						return Integer.parseInt(o2[3])-Integer.parseInt(o1[3]);
					}
					
					return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
				}
				return Integer.parseInt(o2[1])-Integer.parseInt(o1[1]);
			}
		
		});
		
		for(int i=0;i<N;i++) {
			sb.append(Stu[i][0]).append("\n");
		
			
		}
		
		System.out.println(sb);
		
	}
}
