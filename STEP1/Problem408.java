package javacmp;

import java.util.Scanner;

public class Problem408 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("要素数:");
		int n = new Scanner(System.in).nextInt();
		int[] data = new int[n];
		int[] hantei = new int[n];

		int r0= new java.util.Random().nextInt(10)+1;
		//int r1 = r0+1;
		data[0]=r0;
		hantei[0]=r0;

		System.out.println(data[0]);

		for(int i=1;i<n;i++){
			int r1 = new java.util.Random().nextInt(10)+1;
			//int r2 = r%10 +1;
			data[i]=r1;
			for(int j=0;j<n;j++){
				if(data[i]==hantei[j]){
					System.out.println("("+data[i]+")");
					int r2 =new java.util.Random().nextInt(10)+1;
					data[i]=r2;
					j=-1;
					System.out.println("check中");
				}
			}
			hantei[i]=data[i];
			System.out.println(data[i]);


		}
	}

}
