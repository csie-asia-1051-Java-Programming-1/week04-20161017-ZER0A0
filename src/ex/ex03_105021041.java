package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class ex03_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("輸入數字：");
		int n = scn.nextInt();
		
		for(int a = 1 ; a <= n ; a ++)
		{for(int b = 1 ; b <= a ; b ++)
		{System.out.print("*");}
		System.out.println();}

	}

}
