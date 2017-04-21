package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class UtsSample04 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int sum=0;
		int[] data;
		data = new int[10];

		System.out.println("10個の整数値を入力してください");

		for (int i=0; i<10;i++){
			data[i] = new Scanner(System.in).nextInt();
			sum = sum +data[i];
		}
		System.out.println("合計値は" + sum+"です。");
	}

}
