package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem304 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("xの値を入力してください");
		int x = new Scanner(System.in).nextInt();

		System.out.print("yの値を入力してください");
		int y = new Scanner(System.in).nextInt();

		if(x%y==0)
			System.out.println(x+"は"+y+"で割り切れます。");
		else
			System.out.println(x+"は"+y+"で割り切れません。");
	}

}
