package javacmp5syou;

import java.util.Scanner;

class SumUp {

	public static int sumUp(int x){
		int sum=0;

		for(int i=0;i<=x;i++){
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("１からxまでの和を求めます。");
		System.out.print("x=");
		int x=new Scanner(System.in).nextInt();

		System.out.println("1から"+x+"までの和は"+sumUp(x)+"です。");
	}

}
