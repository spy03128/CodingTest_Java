package BAEKJOON;

import java.util.Scanner;

public class S2_14620 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int N = sc.nextInt();
		int[][] map = new int[N][N];
		int[][] cost = new int[N][N];
		boolean[][] visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}


		for (int i = 1; i < N - 1; i++) {
			for (int j = 1; j < N - 1; j++) {

				cost[i][j] = map[i][j] + map[i - 1][j] + map[i + 1][j] + map[i][j - 1] + map[i][j + 1];
		
			}
		}
		
		int sum=0;
		int num = (N-2)*(N-2);
		int min = Integer.MAX_VALUE;
		for(int i=1;i<=num;i++) {
			visited[(i-1)/(N-2)+1][(i-1)%(N-2)+1] = true;
			visited[(i-1)/(N-2)+1-1][(i-1)%(N-2)+1] = true;
			visited[(i-1)/(N-2)+1+1][(i-1)%(N-2)+1] = true;
			visited[(i-1)/(N-2)+1][(i-1)%(N-2)] = true;
			visited[(i-1)/(N-2)+1][(i-1)%(N-2)+2] = true;
            for(int j=i+1;j<=num;j++) {
                if(visited[(j-1)/(N-2)][(j-1)%(N-2)+1] == false && visited[(j-1)/(N-2)+1][(j-1)%(N-2)] == false) {
                    visited[(j-1)/(N-2)+1][(j-1)%(N-2)+1] = true;
                    visited[(j-1)/(N-2)+1-1][(j-1)%(N-2)+1] = true;
                    visited[(j-1)/(N-2)+2][(j-1)%(N-2)+1] = true;
                    visited[(j-1)/(N-2)+1][(j-1)%(N-2)] = true;
                    visited[(j-1)/(N-2)+1][(j-1)%(N-2)+2] = true;
                    for(int k=j+1;k<=num;k++) {
                        if(visited[(k-1)/(N-2)][(k-1)%(N-2)+1] == false && visited[(k-1)/(N-2)+1][(k-1)%(N-2)] == false) {
                            sum+= cost[(i-1)/(N-2)+1][(i-1)%(N-2)+1]+cost[(j-1)/(N-2)+1][(j-1)%(N-2)+1]+cost[(k-1)/(N-2)+1][(k-1)%(N-2)+1];
                            if(sum<min) min=sum;
                        }

                        
                        sum=0;
                    }
                    
                    visited[(j-1)/(N-2)+1][(j-1)%(N-2)+1] = false;
                    visited[(j-1)/(N-2)+1-1][(j-1)%(N-2)+1] = false;
                    visited[(j-1)/(N-2)+2][(j-1)%(N-2)+1] = false;
                    visited[(j-1)/(N-2)+1][(j-1)%(N-2)] = false;
                    visited[(j-1)/(N-2)+1][(j-1)%(N-2)+2] = false;
                }
                
            }
            
            visited[(i-1)/(N-2)+1][(i-1)%(N-2)+1] = false;
            visited[(i-1)/(N-2)+1-1][(i-1)%(N-2)+1] = false;
            visited[(i-1)/(N-2)+1+1][(i-1)%(N-2)+1] = false;
            visited[(i-1)/(N-2)+1][(i-1)%(N-2)] = false;
            visited[(i-1)/(N-2)+1][(i-1)%(N-2)+2] = false;
        }

        System.out.println(min);

	}
}

/*
7
200 200 200 1 0 200 200
200 200 1 1 1 200 200
200 1 0 1 1 200 200
1 1 1 200 200 200 200
200 1 200 200 0 200 200
200 200 200 0 0 0 200
200 200 200 200 0 200 200

*/
