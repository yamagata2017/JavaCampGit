package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class UtsSample02 {

	public static void main(String[] args)throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数のデータを一個入力してください");

		int data1 = new Scanner(System.in).nextInt();

		if ( data1%2 ==0){
			System.out.println("偶数です。");
		}
		else{
			System.out.println("奇数です。");
		}
	}

}
