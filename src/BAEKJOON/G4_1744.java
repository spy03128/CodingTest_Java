package BAEKJOON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class G4_1744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		boolean zero = false;
		int one = 0;
		
		
		for(int i=0;i<N;i++) {
			int x = sc.nextInt();
			if(x>0) {
				if(x==1) one++;
				else max.add(x);
			}
			else if(x<0) min.add(x);
			else if(x==0) zero = true;
		}
		
		int sum = 0;
		int ms = 0;
		int xs = 0;
		while(!min.isEmpty()){
			if(min.size()==1) {
				ms = min.remove();
				break;
			}
			int a = min.remove();
			int b = min.remove();
			int temp = a*b;
			sum += temp;
		}
		
		
//		System.out.println(sum);

		
		while(!max.isEmpty()){
			if(max.size()==1) {
				xs = max.remove();
				break;
			}
			int a = max.remove();
			int b = max.remove();
			int temp = a*b;
			
			sum += temp;
		}
//		System.out.println(sum);
//		System.out.println(xs + " "+ ms);
		
		if(zero) {
			sum += xs;
		}else {
			sum += xs + ms;
		}
		
		sum+=one;
		
		System.out.println(sum);
		
	}
}
