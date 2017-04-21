package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem331 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		final int GOO =1;
		final int TYOKI = 2;
		final int PAR = 3;

		System.out.println("太郎さん");
		int taro=new Scanner(System.in).nextInt();

		System.out.println("花子さん");
		int hana=new Scanner(System.in).nextInt();

		if(taro==hana){
			System.out.println("あいこです");
		}
		else if(taro==GOO && hana==TYOKI ||
				taro==TYOKI && hana==PAR ||
				taro==PAR && hana==GOO){
			System.out.println("太郎さんの勝ちです");
		}
		else if(taro==GOO && hana==PAR ||
				taro==TYOKI && hana==GOO ||
				taro==PAR && hana==TYOKI){
			System.out.println("花子さんの勝ちです");
		}


	}

}
