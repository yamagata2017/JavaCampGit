package javacmp;

import java.io.IOException;

public class Practice404 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int[] namber ={3,4,9};
		int i=0;

		System.out.println("一桁の整数を入力してください");
		int input=new java.util.Scanner(System.in).nextInt();

		for(i=0;i<namber.length;i++){
			if(input==namber[i]){
				System.out.println("当たり");
				break;
			}

		}
		//if(i-1==namber.length && input != namber[i]){
			//System.out.println("外れ");
		//}
	}

}