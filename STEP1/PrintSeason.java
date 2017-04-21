package javacmp5syou;

import java.util.Scanner;

class PrintSeason {

	public static String printSeason(int month){

		String s="文字列";
		switch(month){

		case 1:
		case 2:

			s="冬ですね";
			break;

		case 3:
		case 4:
		case 5:
			s="春ですね";
			break;

		case 6:
		case 7:
		case 8:
			s="夏ですね";
			break;

		case 9:
		case 10:
		case 11:
			s="秋ですね";
			break;

		case 12:
			s="冬ですね";
		}
		return s;
	}


	public static void main(String[] args) {

		System.out.print("何月ですか？");
		int month=new Scanner(System.in).nextInt();

		System.out.println("その月の季節は"+printSeason(month));

	}

}
