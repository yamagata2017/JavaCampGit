package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem329 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int ans =new java.util.Random().nextInt(11);
		int n=1;
		int data=new Scanner(System.in).nextInt();


		for(int i=0;i<10;i++){
			if(ans==data){

				System.out.println("正解です！！"+n+"回目で当たりました");
				break;

			}

			else	if(ans>data){
				System.out.println("もっと大きい数です");
				data=new Scanner(System.in).nextInt();

				n++;
			}
			else{
				System.out.println("もっと小さい数です");
				data=new Scanner(System.in).nextInt();

				n++;
			}
		}
	}

}
