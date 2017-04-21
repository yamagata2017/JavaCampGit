package javacmp5syou;

import java.util.Scanner;

class SumOf {

	public static int sumOf(int[] array){

		int sum=0;

		for(int i=0;i<array.length;i++){
			sum=sum+array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("要素数:");
		int n=new Scanner(System.in).nextInt();
		int[] array=new int[n];

		for(int i=0;i<array.length;i++){
			System.out.print("x["+i+"]:");
			array[i]=new Scanner(System.in).nextInt();
			//System.out.println(array[i]);
		}
		System.out.print("全要素の合計は"+sumOf(array)+"です");
	}

}
