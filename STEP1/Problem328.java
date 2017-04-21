package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem328 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		int n=new Scanner(System.in).nextInt();
		int i=2;

		while(i<n){
			if(n%i==0){
				System.out.println(n+"は素数ではありません");
				break;
			}
			else if(i==n-1){
					System.out.println(n+"は素数です");
				}
				i++;
		}
		//
		//}

	}
}
