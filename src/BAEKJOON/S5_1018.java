package BAEKJOON;

import java.util.Scanner;

public class S5_1018 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		sc.nextLine();
		char[][]map = new char[N][M];

		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			map[i] = s.toCharArray();
		
		}
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<=N-8;i++) {
			for(int j=0;j<=M-8;j++) {
				
				char start = 'B';
				int newx=0,newy=0;
				int num=0;
				for(int x=i;x<i+8;x++) {
					for(int y=j;y<j+8;y++) {
						newx = x-i;
						newy = y-j;
						if(newx==0 || newx==2 || newx==4|| newx==6) {
							
							if(newy==0 ||newy ==2||newy==4||newy==6) {
								if(map[x][y]!=start) num++;
									
							}else {
								if(map[x][y]==start) num++;
							}
							
						}else {
							if(newy==1 ||newy ==3||newy==5||newy==7) {
								if(map[x][y]!=start) num++;
									
							}else {
								if(map[x][y]==start) num++;
							}
						}
						
						
					}
				}
				
				
				
				if(num<min) min=num;
				
				
				start = 'W';
				newx=0;newy=0;
				num=0;
				for(int x=i;x<i+8;x++) {
					for(int y=j;y<j+8;y++) {
						newx = x-i;
						newy = y-j;
						if(newx==0 || newx==2 || newx==4|| newx==6) {
							
							if(newy==0 ||newy ==2||newy==4||newy==6) {
								if(map[x][y]!=start) num++;
									
							}else {
								if(map[x][y]==start) num++;
							}
							
						}else {
							if(newy==1 ||newy ==3||newy==5||newy==7) {
								if(map[x][y]!=start) num++;
									
							}else {
								if(map[x][y]==start) num++;
							}
						}
						
						
					}
				}
				
				
				
				if(num<min) min=num;
			}
		}
		
		System.out.println(min);
		
		
		
	}
}
