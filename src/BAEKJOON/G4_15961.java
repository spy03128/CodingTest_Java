package BAEKJOON;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class G4_15961 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 접시 수
		int d = sc.nextInt(); // 초밥 가지수
		int k = sc.nextInt(); // 연속해서 먹는 초밥
		int c = sc.nextInt(); // 쿠폰 번호
		
		int max=0;

		int chobab[] = new int[N];
	
	
		for (int i = 0; i < N; i++) {
			chobab[i] = sc.nextInt();
		}

		
		int number[] = new int[3001];
		
		Queue<Integer> queue = new LinkedList<>();
		boolean check = false;
		
		for(int i=0;i<k;i++) {
			int x = chobab[i];
			queue.offer(x); //0 ~ K-1
			number[x] ++;
			
		}
		int num=0; //초밥 가지수
		for(int i=0;i<=3000;i++) {
			if(number[i]>0) num++;
			
		}
		if(number[c]==0) {
			check = true;
			num++;
		}

		max = num;
		
		for(int i=1;i<=N;i++) {
			int x = queue.poll(); 
			if(number[x]==1) num--;
			number[x]-=1;
			
			int temp = i+k-1; 
			if(temp>=N) temp = temp-N;
			
			
			int y = chobab[temp];
			
			queue.offer(y);
			if(number[y]==0) num++;
			number[y]+=1;
			
			if(check==true && number[c]!=0) {
				check = false;
				num--;
			}else if(check==false && number[c]==0) {
				check = true;

				num++;
			}
		
			if(num>max) max=num;
		}
		

	
		
		System.out.println(max);

	}
}
