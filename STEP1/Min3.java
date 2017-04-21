package javacmp5syou;

import java.util.Scanner;

public class Min3 {

	public static int min3(int a,int b,int c){
		int n =0;

		if(a<b && a<c){
			n=a;
		}
		else if(b<a && b<c){
			n=b;
		}
		else{
			n=c;
		}
		return n;
	}


	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);

		System.out.print("整数a");int a = stdln.nextInt();
		System.out.print("整数b");int b = stdln.nextInt();
		System.out.print("整数c");int c = stdln.nextInt();

		System.out.println("最小値は"+min3(a,b,c)+"です。");
	}

}
