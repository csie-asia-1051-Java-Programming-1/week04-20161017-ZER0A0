package hw;
/*
 * Topic: 程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，
 * 然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n。
 * Date: 2016/10/23
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class hw03_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = 0;
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		
		while(n != 999)
		{System.out.print("輸入整數：");
		n = scn.nextInt();
		if(n > 0 && n != 999){t1 = t1 + 1;}
		else{if(n < 0){t2 = t2 +1;}
		else{if(n == 0){t3 = t3 +1;}
		else{if(n == 999)
		{System.out.println(t1+"個正數，"+t2+"個負數，"+t3+"個0");}}}}}
		
	}

}
