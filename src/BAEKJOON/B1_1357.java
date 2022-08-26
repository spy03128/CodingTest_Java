package BAEKJOON;

import java.util.Scanner;
public class B1_1357 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        sb.append(X).reverse();
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Y).reverse();

        int ans = Integer.parseInt(sb.toString()) + Integer.parseInt(sb2.toString());
        StringBuilder sb3 = new StringBuilder();

        System.out.println(Integer.parseInt(sb3.append(ans).reverse().toString()));
    }
}