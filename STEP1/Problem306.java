package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem306 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("点数を入力してください。");
		int a = new Scanner(System.in).nextInt();

		if(a>79)
			System.out.println("評価はAです。");
		else if(a>69)
			System.out.println("評価はBです。");
		else if(a>59)
			System.out.println("評価はCです。");
		else
			System.out.println("評価はDです。");
	}

}
