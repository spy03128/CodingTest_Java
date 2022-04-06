package BAEKJOON;

import java.util.Scanner;

public class G4_2239 {
	static int[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 map = new int[9][9];
		
		for(int i=0;i<9;i++) {
			String s = sc.nextLine();
			for(int j=0;j<9;j++) {
				map[i][j] = s.charAt(j)-'0';
			}
		}
		
		
		dfs(0,0);
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
	}

	private static boolean dfs(int i, int j) {
		
		if(i==9) return true;
			
		int r = i;
		int c = j+1;
		if(c==9) {
			c = 0;
			r++;
		}
		
		if(map[i][j]==0) {
			
			number : for(int x=1;x<=9;x++) {
				
				//가로확인
				for(int y=0;y<9;y++) {
					if(map[i][y]==x) continue number;
				}
				
				//세로확인
				for(int y=0;y<9;y++) {
					if(map[y][j]==x) continue number;
				}
				
				//네모칸 확인
				int newi = i/3 *3;
				int newj = j/3 *3;
				
				for(int ni = newi;ni<newi+3;ni++) {
					for(int nj = newj;nj<newj+3;nj++) {
						if(map[ni][nj] ==x) continue number;
						
					}
					
				}
				
				map[i][j] = x;
				if(dfs(r,c)==true)  return true;
				
				
			}
			 map[i][j] =0;
			 return false;
		
		
		}else {
			
			return dfs(r,c);
		}
		
		
		
		
		
		
	}
}
