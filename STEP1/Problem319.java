package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem319 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int sum = 0;
		double ave =0;


		System.out.println("何個のデータですか");
		int n=new Scanner(System.in).nextInt();
		int data[]=new int[n];

		for(int i=0;i<n;i++){
			data[i]=new Scanner(System.in).nextInt();
			sum=sum+data[i];
		}

		ave =sum/(double)n;

		System.out.println("合計値＝"+sum);
		System.out.println("平均値＝"+ave);
	}

}
