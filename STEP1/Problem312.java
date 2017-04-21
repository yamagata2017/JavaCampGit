package javacmp;

public class Problem312 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int height;
		System.out.println("身長　　　　　体重");
		for(int i=0; i<7; i++){
			height=150+i*5;
			double hyoujun =(height - 100)*0.9;
				System.out.println(height+"　　　　　"+hyoujun);

		}
	}
}
