package javacmp;

import java.util.Scanner;

public class Problem325switch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int month=new Scanner(System.in).nextInt();

		switch(month){

		case 1:
		case 2:

			System.out.println("冬ですね");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("春ですね");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("夏ですね");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("秋ですね");
			break;

		case 12:
			System.out.println("冬ですね");
		}
	}

}
