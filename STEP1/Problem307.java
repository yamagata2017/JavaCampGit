package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem307 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int a;
		int b;
		System.out.print("合計金額を入力してください。");
		a= new Scanner(System.in).nextInt();
		b= a*108/100;

		if(b>3000){
			System.out.println("支払金額は、"+b+"です。");
		}
		else {
			System.out.println("支払金額は、"+(b+500)+"です。");
		}
	}

}
