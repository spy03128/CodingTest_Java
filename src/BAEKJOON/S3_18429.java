package BAEKJOON;
import java.util.Scanner;

public class S3_18429 {

	static int N,K;
	static int [] list,arr;
	static boolean [] visited;
	static int sum=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); //운동
		K = sc.nextInt(); //빠지는 중량
		list = new int[N];
		arr = new int[N];
		for(int i=0;i<N;i++) {
			list[i] = sc.nextInt();
		}
		visited = new boolean[N];
		permu(0);
		System.out.println(sum);
	}
	
	private static void permu(int cnt) {
		if(cnt==N) {
			boolean check = false;
			int kg = 500;
			for(int x=0;x<N;x++) {
				kg = kg + arr[x] - K;
				if(kg<500) {
					check = true;
					break;
				}
				
			}
			if(!check) sum++;
			
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				arr[cnt] = list[i];
				visited[i] = true;
				permu(cnt+1);
				visited[i] =false;
				
			}
		}
		
		
	}


}
