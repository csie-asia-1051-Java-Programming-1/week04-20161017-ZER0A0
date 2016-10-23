package hw;
/*
 * Topic: 讓使用者輸入1, 2, 3, 與4選項，
 *1.輸入 n 並顯示圖形 (ex: n = 5)
    @@@
    @@
    @
    @@
    @@@
2.輸入 n 並顯示圖形
    %
    %%
    %%%
    %%
    %
3.輸入 n (必須是奇數)並顯示圖形
　　  ＊
  　＊＊＊
  ＊＊＊＊＊
  　＊＊＊
  　　＊
4.結束程式
 * Date: 2016/10/23
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;
public class hw04_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("輸入1,2,3,4：");
		int n = scn.nextInt();
		
		if(n == 1)
		{System.out.print("輸入正整數：");
		int a = scn.nextInt();}}}