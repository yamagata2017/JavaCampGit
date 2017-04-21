package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem302 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("整数を入力してください");
		int a = new Scanner(System.in).nextInt();

		if(a % 2 == 0)
			System.out.println("入力されたデータは偶数です。");
		else
			System.out.println("入力されたデータは奇数です。");
	}

}
