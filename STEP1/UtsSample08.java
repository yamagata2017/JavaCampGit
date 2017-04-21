package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class UtsSample08 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int sum=0;
		int[] data = new int[10];
		int n=0;
		double heikin = 0.0;

		for(int i=0; i<10; i++){
			data[i] = new Scanner(System.in).nextInt();
			if (data[i] ==0){
				break;
			}
			else {
				sum = sum + data[i];
				n++ ;

			}
		}
		heikin = (double)sum / n ;

		System.out.println("合計値は" + sum+"です。");
		System.out.println("平均値は" + heikin+"です。");
	}
}
