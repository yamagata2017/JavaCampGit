package javacmp;

import java.io.IOException;
import java.util.Scanner;

public class Problem412 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		int[][] room={{101,102,201,202,301},{4,4,3,4,6}};
		int number =new Scanner(System.in).nextInt();
		int n=1;
		int[] able=new int[n];

		System.out.print("あいている部屋は");
		for(int i=0;i<room[0].length;i++){
			if(i==0 || i==2 || i==3){
				if(room[1][i]>=number){
					able[0]=room[0][i];
					System.out.print("、"+able[0]+"号室");
				}
			}

		}
		System.out.println("です。");
	}
}
