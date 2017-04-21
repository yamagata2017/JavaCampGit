package javacmp;

import java.util.Scanner;

public class Problem320 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int sum = 0;
		double ave =0;
		int data=0;
		int n=0;

		for(int i=0;i<10;i++){
			data=new Scanner(System.in).nextInt();

		if(data==0){
				break;
		}
		else{
			sum=sum+data;
			n++;
		}

		ave =sum/(double)n;


		}
		System.out.println("合計値＝"+sum);
		System.out.println("平均値＝"+ave);
	}

}
