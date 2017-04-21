package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem106 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("length=");
		int l= new Scanner(System.in).nextInt();

		System.out.print("height=");
		int h = new Scanner(System.in).nextInt();
		double taiseki = l*l*h/3.0;

		System.out.println("体積＝"+taiseki);

	}

}
