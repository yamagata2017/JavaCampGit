package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem317 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		int data;
		int max=0;

		for(int i=0;i<10;i++){
			data=new Scanner(System.in).nextInt();
			if(max<data){

				max=data;
			}
		}
		System.out.println("最大値＝"+max);
	}

}
