package javacmp5syou;

import java.util.Scanner;

class ArrayClone {

	public static int[] arrayClone(int[] array){

		int[] arrayc=array;

		return arrayc;
	}

	public static void main(String[] args) {

		System.out.print("要素数:");
		int n =new Scanner(System.in).nextInt();
		int[] array=new int[n];

		 for(int i=0;i<n;i++){
			 System.out.print("x["+i+"]:");
			 array[i]=new Scanner(System.in).nextInt();
		 }

		 int[] arrayclone=arrayClone(array);

		 System.out.println("配列xの複製yを作りました。");
		 for(int i=0;i<n;i++){
			 System.out.print("y["+i+"]:"+arrayclone[i]+" ");
		 }
	}

}
