package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem330 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int year=new Scanner(System.in).nextInt();

		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"はうるう年です");
		}
		else{
			System.out.println("うるう年ではありません");
		}
	}

}
