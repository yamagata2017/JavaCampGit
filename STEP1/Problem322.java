package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem322 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int data1=new Scanner(System.in).nextInt();
		int data2=new Scanner(System.in).nextInt();

		if(data1>data2){
			System.out.println(data2+"　"+data1);
		}

		else{

			System.out.println(data1+"　"+data2);
		}
	}

}
