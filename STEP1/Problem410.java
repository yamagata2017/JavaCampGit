package javacmp;

import java.util.Scanner;

public class Problem410 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] sumDay={31,60,91,121,151,182,213,244,274,305,335,366};
		int month= new Scanner(System.in).nextInt();
		int date= new Scanner(System.in).nextInt();
		int sum=0;

		if(month==1){
			sum=date-1;
		}
		else{
			sum=sumDay[month-2]+date-1;
		}
		System.out.print("通算日数＝"+sum+"日です。");
	}

}
