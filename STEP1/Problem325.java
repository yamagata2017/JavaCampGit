package javacmp;

import java.util.Scanner;

public class Problem325 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a=new Scanner(System.in).nextInt();
		int d=new Scanner(System.in).nextInt();
		int n=new Scanner(System.in).nextInt();

		System.out.print(a);

		for(int i=0;i<n-1;i++){
			a=a+d;
			System.out.print("　"+a);
		}
	}

}
