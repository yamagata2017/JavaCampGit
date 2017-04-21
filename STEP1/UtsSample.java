package javacmp;

public class UtsSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int data1; //整数型の変数data1
		int data2; //整数型の変数data2
		int sum ;  //合計値を格納する整数型の変数sum
		int hiku ;
		double waru ;
		int kake ;

		data1 = 10;
		data2 = 20;
		sum = data1 + data2; //data1の値とdata2の値の合計値
		hiku  = data1 - data2; //
		kake = data1 * data2;
		waru = (double)data1 / data2;


		System.out.println("変数data1の値は"+ data1+" です");
		System.out.println("変数data2の値は"+ data2+" です");
		System.out.println("変数sumの値は"+ sum+"です");
		System.out.println("変数hikuの値は"+ hiku+"です");
		System.out.println("変数kakeの値は"+ kake+"です");
		System.out.println("変数waruの値は"+ waru+"です");
	}

}
