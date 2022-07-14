package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G4_1717 {
	static int[] arr;
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		for(int i=0;i<=n;i++) {
			arr[i] = i;
		}
		for(int i=0;i<m;i++) {
			StringTokenizer str = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(str.nextToken());
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			if(x==0) {
				union(a,b);
			}else{
				if(find(a)==find(b)) System.out.println("YES");
				else System.out.println("NO");
			}
			
			
			
		}
		
	}

//	public static boolean check(int a, int b) {
//		a = find(a);
//		b = find(b);
//		
//		if(a==b) return true;
//		else return false;
//	}

	public static int find(int a) {
		if(a==arr[a]) return a;
		else return arr[a]=find(arr[a]);
	}

	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		
		if(a!=b) {
			if(a>b)	arr[a] = b;
			else arr[b] = a;
		}
		
	}
}
