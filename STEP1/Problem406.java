package javacmp;

import java.util.Scanner;

public class Problem406 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("要素数:");

		int n=new Scanner(System.in).nextInt();
		int[] data=new int[n];
		int find =0;
		for(int i=0;i<data.length;i++){
			System.out.print("a["+i+"]:");
			data[i]=new Scanner(System.in).nextInt();
		}
		//for(int i=0;i<data.length;i++){
		//	System.out.println(data[i]);
		//}
		System.out.print("探す値:");
		find = new Scanner(System.in).nextInt();
		//System.out.println(find);
		for(int i=n-1;i>0;i--){
			if(data[i]==find){
				System.out.println(find+"は、a["+i+"]にあります");
				break;
			}
		}
	}

}
