package javacmp;

import java.util.Scanner;

public class Problem409 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] day={31,29,31,30,31,30,31,31,30,31,30,31};
		int month=new Scanner(System.in).nextInt();
		int date=new Scanner(System.in).nextInt();
		int sum=0;

		for(int i=0;i<month-1;i++){
			sum=sum+day[i];
		}
		sum=sum+date-1;
		//System.out.println(sum);
		//for(int i=0;i<date-1;i++){
		//sum++;
		//}
		System.out.print("通算日数＝"+sum+"日です。");
	}

}
