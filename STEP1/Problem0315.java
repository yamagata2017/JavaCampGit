package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem0315 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int sum = 0;
		int n=new Scanner(System.in).nextInt();
		double ave;


		for(int i=0;i<n;i++){
			sum=sum+i+1;

		}
		ave=sum/(double)n;

		System.out.println("合計値＝"+sum);
		System.out.println("平均値＝"+ave);

	}

}
