package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem326 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("MONTH=");
		int month=new Scanner(System.in).nextInt();

		if(month<6 && month>2){
			System.out.println("春ですね");
		}
		else if(month<9 && month>5){
			System.out.println("夏ですね");
		}
		else if(8<month && month<12){
			System.out.println("秋ですね");
		}
		else{
			System.out.println("冬ですね");
		}
	}

}
