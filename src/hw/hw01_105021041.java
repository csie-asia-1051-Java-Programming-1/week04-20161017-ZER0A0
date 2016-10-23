package hw;
/*
 * Topic: 使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 ) 1, 1, 2, 3, 5。
 * Date: 2016/10/23
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class hw01_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("輸入正整數：");
		int n = scn.nextInt();
		int a = 1;
		int b = 1;
		int c = 2;
		int t = 0;
		
		if(n == 1)
		{System.out.println("1");}
		else{if(n == 2)
		{System.out.println("1 , 1");}}
		if(n > 2)
		{System.out.print("1 , 1");}
		
		while(c < n && n >= 3)
		{t = a+b; a = b; b = t; c++;
		System.out.print(" , " + t);}

	}

}
