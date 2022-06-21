package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_12891 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		String s = br.readLine();
		
		StringTokenizer num = new StringTokenizer(br.readLine()," ");
		
		int[] check = new int[4];
		for(int i=0;i<4;i++) {
			check[i] = Integer.parseInt(num.nextToken());
		}
		
		int number[] = new int[4];
		int count = 0;
		
		
		for(int i=0;i<P;i++) {
			if(s.charAt(i)=='A') number[0]++;
			else if(s.charAt(i)=='C') number[1]++;
			else if(s.charAt(i)=='G') number[2]++;
			else if(s.charAt(i)=='T') number[3]++;
		}
		
		if(number[0]>=check[0] &&number[1]>=check[1] && number[2]>=check[2]&&number[3]>=check[3]) {
			count++;
		}
		
		
		
		for(int i=1;i<=S-P;i++) {
			if(s.charAt(i-1)=='A') number[0]--;
			else if(s.charAt(i-1)=='C') number[1]--;
			else if(s.charAt(i-1)=='G') number[2]--;
			else if(s.charAt(i-1)=='T') number[3]--;
			
			
			int dx = i+P-1;
			if(s.charAt(dx)=='A') number[0]++;
			else if(s.charAt(dx)=='C') number[1]++;
			else if(s.charAt(dx)=='G') number[2]++;
			else if(s.charAt(dx)=='T') number[3]++;
			
			if(number[0]>=check[0] &&number[1]>=check[1] && number[2]>=check[2]&&number[3]>=check[3]) {
				count++;
			}
			
			
		}
		
		
		System.out.println(count);
		
	}
}
