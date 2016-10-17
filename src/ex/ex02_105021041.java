package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class ex02_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("輸入兩個數字：");
		int n = scn.nextInt();
		int m = scn.nextInt();
		for(int a = 1 ; a <= n ; a ++)
		{for(int b = 1 ; b <= m ; b ++)
		{System.out.print(a+"x"+b+"="+a*b+"\t");}
		System.out.println();}
		System.out.println("是否繼續(Y/N)");
		

	}

}
