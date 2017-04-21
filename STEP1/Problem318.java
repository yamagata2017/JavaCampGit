package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem318 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int data;
		int min=new Scanner(System.in).nextInt();

		for(int i=0;i<9;i++){

			data=new Scanner(System.in).nextInt();;
			if(data<min){

				min=data;

			}
		}
		System.out.println("最小値＝"+min);
	}

}
