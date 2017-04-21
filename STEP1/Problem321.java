package javacmp;

import java.util.Scanner;

public class Problem321 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int data=new Scanner(System.in).nextInt();
		int n=1;

		while(data>10){
			data=data/10;
			n++;
		}
		System.out.println(n);
	}

}
