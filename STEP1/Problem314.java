package javacmp;

public class Problem314 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum=0;

		for(int i=0;i<10;i++){
			sum = sum+i+1;
		}
		double ave=sum/10.0;

		System.out.println("合計値＝"+sum);
		System.out.println("平均値＝"+ave);

	}

}
