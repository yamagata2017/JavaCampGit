package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem318e {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int data=0;
		int sum=0;
		double ave=0;
		int n;

		System.out.println("何個のデータですか？");

		n=new Scanner(System.in).nextInt();

		for(int i=0;i<n;i++){
			data=new Scanner(System.in).nextInt();
			sum=sum+data;
		}
		ave=(double)sum/n;
		
		System.out.println("合計値＝"+sum);
		System.out.println("平均値＝"+ave);
	}

}
