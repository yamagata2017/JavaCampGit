package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem316 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int[] data=new int[10];
		int sum = 0;
		double ave =0;

		for(int i=0;i<10;i++){
			data[i]=new Scanner(System.in).nextInt();
			sum=sum+data[i];
		}
		ave=sum/10.0;

		System.out.println("合計値＝"+sum);
		System.out.println("平均値＝"+ave);
	}



}
