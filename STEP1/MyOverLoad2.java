package javacmp5syou;

import java.util.Scanner;

public class MyOverLoad2 {

	public static int  myArea(int x){

		double sum = 0;
		sum = x * x * 3.14;
		return (int)sum;

	}

	public static double myArea(int x,int y){

		double sum =0;
		sum = x * y;
		return sum;
	}

	public static void main(String[] args){

		int x=0;

		System.out.print("引数の数を入力してください(1か2)");
		int n = new Scanner(System.in).nextInt();

		System.out.println("引数[x]を入力してください");
		x = new Scanner(System.in).nextInt();

		if(n==1){

			double s = myArea(x);
			System.out.println("面積は"+s+"です");
		}
		else{
			System.out.println("引数[y]を入力してください");
			int y = new Scanner(System.in).nextInt();
			int s =(int)myArea(x,y);
			System.out.println("面積は"+s+"です");
		}

	}
}
