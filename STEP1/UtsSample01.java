package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class UtsSample01 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数２つのデータを入力してください");

		int sum;
		int data1 = new Scanner(System.in).nextInt();
		int data2 = new Scanner(System.in).nextInt();

		sum = data1 + data2;

		System.out.println("変数sumの値は" + sum+"です。");
	}

}
