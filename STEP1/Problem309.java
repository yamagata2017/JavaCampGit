package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem309 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("コーヒーの定価を入力してください");
		int a = new Scanner(System.in).nextInt();

		System.out.print("入金金額を入力してください");
		int b = new Scanner(System.in).nextInt();

		int oturi = b-a;
		int c = oturi/100;
		int d = (oturi - c*100) / 50;
		int e = (oturi - c*100)%50/10;

		System.out.println("お釣り＝100円硬貨は"+c+"枚、50円硬貨は"+d+"枚、10円硬貨は"+e+"枚です。");
	}

}
