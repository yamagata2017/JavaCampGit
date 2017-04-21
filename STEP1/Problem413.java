package javacmp;

import java.util.Scanner;

public class Problem413 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("要素数:");
		int n=new Scanner(System.in).nextInt();
		int[] elements=new int[n];
		int[][] graph=new int[10][n];

		for(int i=0;i<n;i++){
			elements[i]=new java.util.Random().nextInt(10)+1;
		}
		for(int i=0;i<n;i++){
			System.out.println(elements[i]);
		}

		for(int j=0;j<10;j++){
			for(int i=0;i<n;i++){
			graph[j][i]=10-elements[i]-j;
				if(graph[j][i]<=0){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
		//for(int j=0;j<10;j++){
		//	for(int i=0;i<graph.length;i++){
		//		if(graph[j][i]<=0){
		//			System.out.print("*");
		//		}
		//		else{
		//			System.out.print(" ");
		//		}
		//	}
		//}
	}

}
