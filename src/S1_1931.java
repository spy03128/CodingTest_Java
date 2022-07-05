import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S1_1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		
		for(int i=0;i<N;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) return o1[0]-o2[0];
				return o1[1] - o2[1];
			}
		});
		
		int start = 0;
		int end = 0;
		int count = 1;
		for(int i=0;i<N;i++) {
			if(i==0) {
				start = arr[i][0];
				end = arr[i][1];
			}else {
				if(end<=arr[i][0]) {
					start = arr[i][0];
					end = arr[i][1];
					count++;
				}
			}
		}
		System.out.println(count);
		
		
	}
}
