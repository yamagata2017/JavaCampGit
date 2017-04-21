package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem323 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int data=new Scanner(System.in).nextInt();
		int n=1;

		while(data>10){
			data=data/10;
			n++;
		}

		if(n==3){
			System.out.println("三ケタの整数です");
		}
		else{
			System.out.println("三ケタの整数ではありません");

		}
	}

}
