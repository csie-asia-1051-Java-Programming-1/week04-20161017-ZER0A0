package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class ex01_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		while(a >= 0)
		{System.out.println("輸入數字：");
		a = scn.nextInt();
		b = b+a;
		c = c+1;}
		if(a == -1)
		{System.out.println("總和 = "+(b+1)+"，平均 = "+(b+1)/(c-1));}


	}

}
