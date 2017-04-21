package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem301 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("整数を入力してください");
		int a = new Scanner(System.in).nextInt();
		if(a>0)
			System.out.println("入力されたデータは正の数です。");
		else
			System.out.println("入力されたデータは負の数です。");
	}

}
