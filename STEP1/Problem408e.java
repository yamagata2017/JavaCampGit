package javacmp;

import java.util.Scanner;

public class Problem408e {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("要素数:");
		int n = new Scanner(System.in).nextInt();
		int[] data = new int[n];
		int[] hantei = new int[n];


		for(int i=0;i<n;i++){
			int r= new java.util.Random().nextInt(10)+1;
			data[0]=r;
			hantei[0]=r;

			for(int j=0;j<n;j++){
				if(data[i]==hantei[j]){
					i=0;
					break;
				}
			}
			hantei[i]=data[i];
			System.out.println(data[i]);
		}
	}

}
