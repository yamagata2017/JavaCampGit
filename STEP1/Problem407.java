package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem407 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("要素数:");
		int n = new Scanner(System.in).nextInt();
		int[] data = new int[n];
		
		for(int i=0;i<data.length;i++){
			int r = new java.util.Random().nextInt();
			if(r<0){
				r=r*-1;
			}
			int r2 = r%10 +1;
			data[i]=r2;
			System.out.println(data[i]);
			
			
		}
	}

}
