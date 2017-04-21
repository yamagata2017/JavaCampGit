package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem332 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("m=");
		int m =new Scanner(System.in).nextInt();

		System.out.println("n=");
		int n =new Scanner(System.in).nextInt();

		int r =m%n;

		while(r!=0){

			r=m%n;
			m=n;
			n=r;
			//System.out.println(n);
		}
		System.out.println("最大公約数は"+m+"です");

	}

}
