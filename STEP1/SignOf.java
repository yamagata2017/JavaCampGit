package javacmp;

import java.util.Scanner;

public class SignOf {

	public static int signOf(int x){

		int n=0;

		if(x>0){
			n=1;
		}
		else if(x==0){
			n=0;
		}
		else{
			n=-1;
		}
		return n;

	}


	public static void main(String[] args) {

		int x =new Scanner(System.in).nextInt();
		int s=signOf(x);
		System.out.println("signOf(x)は"+s+"です。");
	}

}
