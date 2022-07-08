package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G5_1107 {
	static int n;
	static boolean num[];
	static int min;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		num = new boolean[10];
		if(m!=0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<m;i++) {
				int z = Integer.parseInt(st.nextToken());
				num[z] = true;
			}
		}
		min = Integer.MAX_VALUE;
		if(n== 100) System.out.println(0);
		else {
			//100에서 이동
			if(Math.abs(100-n)<min) min = Math.abs(100-n);
			
			//모든경우의 수
			
			dfs(0,"");
			System.out.println(min);
			
		}
	
	}

	private static void dfs(int idx,String s) {

		for(int i=0;i<10;i++) {
			if(!num[i]) {
				String nst = s + (i+"");
				int x = n-Integer.parseInt(nst);
				if(Math.abs(x)+nst.length()<min) min =Math.abs(x)+nst.length();
				if(idx<6) dfs(idx+1,nst);
			}
		}
		
	}
}
