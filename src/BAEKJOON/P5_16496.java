package BAEKJOON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P5_16496 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		sc.nextLine();

	    String[] arr = new String[N];
	    
	    String s = sc.nextLine();
	    arr = s.split(" ");
	    
	    
	     
		Arrays.sort(arr,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
					 String temp1 = o2 + o1;
		             String temp2 = o1 + o2;
		             
		             if(temp1.compareTo(temp2)>0) {
		            	 return 1;
		             }


				return -1;
			}
		});
		
		
	     boolean check = false;
	
		
		
	    for(int i=0;i<N;i++){
	    	 if(!arr[i].equals("0")) check=true;
	    	 if(check){
	    		 sb.append(arr[i]);
	    	 }
	    }
	    
	    if(!check){
   		 sb.append("0");
   		 
	    }
   	 
	    System.out.print(sb);
		
	}
}
