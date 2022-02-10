package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;

public class S5_1181 {

	public static void main(String[] args)  throws IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String number = br.readLine();
		int num = Integer.parseInt(number);
		String[] word = new String[num];
		
		for(int i=0;i<num;i++) {
			word[i] = br.readLine();
		}

		
		String temp,temp2;
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				
				if(word[i].length()>word[j].length()) {
					temp = word[i];
					word[i] = word[j];
					word[j] = temp;
				}
				if(word[i].length()==word[j].length()) {
					if(word[i].compareTo(word[j])>0) {
						temp = word[i];
						word[i] = word[j];
						word[j] = temp;
					}
					else if(word[i].compareTo(word[j])==0) {
						word[i]=" ";
					}

				}
			}
			
		}
		

		
		for(int i=0;i<num;i++) {
			if(word[i]!=" ") {
				System.out.print(word[i]+"\n");
			}
			
		}
	}
}
