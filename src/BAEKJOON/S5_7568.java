package BAEKJOON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S5_7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result [] = new int[N];
		int [][] arr = new int[N][3];
		int number [] = new int[N];
		for(int i=0; i<N;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = i;
		}
		
		
		Arrays.sort(arr, new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]-o2[0];
			}
			
		});
		
		
		for(int i=0;i<N;i++) {
			int num=1;
			for(int j=i+1;j<N;j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) num++;
			}
			
			
			number[arr[i][2]] = num;
		}

		
		for(int i=0;i<N;i++) {

			System.out.print(number[i]+" ");
		}
		

	}
}
