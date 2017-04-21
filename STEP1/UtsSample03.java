package javacmp;

import java.io.IOException;

public class UtsSample03 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int sum=0; //合計値を入れる変数
		int[]data = {10,20,30,40,50,60,70,80,90,100};

		for (int i=0; i<10; i++) {    //10回繰り返す
			sum = sum + data[i];       //合計する
		}
		System.out.println("合計値は" + sum+"です。");
	}

}
