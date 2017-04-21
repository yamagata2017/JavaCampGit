package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem305 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("整数を入力してください");
		 int a = new Scanner(System.in).nextInt();

		 if(a>99){
			 System.out.println("入力されたデータは二桁の整数ではありません。");
		 }
		 else if(a<10){
			 System.out.println("入力されたデータは二けたの整数ではありません。");
		 }
		 else{
			 System.out.println("入力されたデータは二桁の整数です。");
		 }
	}

}
