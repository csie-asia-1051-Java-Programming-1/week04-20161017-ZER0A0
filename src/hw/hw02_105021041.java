package hw;
/*
 * Topic: 使用者輸入正整數 n 與 m 然後計算Cn取m。
 * Date: 2016/10/23
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class hw02_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("輸入兩個整數：");
		int n = scn.nextInt();
		int m = scn.nextInt();
		int a = 1;
		int b = 1;
		int c = 1;
		int t1 = 1;
		int t2 = 1;
		int t3 = 1;
		
		while(a <= n){t1 = t1*a; a = a + 1;}
		while(b <= m){t2 = t2*b; b = b + 1;}
		while(c <= (n-m)){t3 = t3*c; c = c + 1;}
		System.out.println(t1/(t2*t3));
		
	}

}
