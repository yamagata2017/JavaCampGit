package javacmp5syou;

import java.util.Scanner;

class AryRmv {

	public static int[] AryRmv(int[] array,int index){

		int[] array1=array;

		//for(int i=0;i<array.length;i++){
		//	System.out.println(array[i]);
		//}

		for(int i=index;i<array.length-1;i++){
			array1[i]=array[i+1];
		}
		//for(int i=0;i<array.length;i++){
		//	System.out.print("("+array[i]+")");
		//}
		return array1;
	}



	public static void main(String[] args) {

		System.out.print("要素数:");
		int n=new Scanner(System.in).nextInt();
		int[] array=new int[n];

		for(int i=0;i<array.length;i++){
			System.out.print("a["+i+"]:");
			array[i]=new Scanner(System.in).nextInt();
		}
		System.out.print("削除する要素のインデックス:");
		int index=new Scanner(System.in).nextInt();

		int[] ans =AryRmv(array,index);
		for(int i=0;i<array.length;i++){
			System.out.println(ans[i]+" ");
		}
	}

}
