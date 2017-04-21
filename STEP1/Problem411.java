package javacmp;

public class Problem411 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[][] sales ={{100,150,200,250,300},{200,300,140,60,350}};
		int syoukei=0;
		int sum=0;
		//for(int i =0;i<sales[0].length;i++){
		//	System.out.println(sales[0][i]);
		//}

		for(int i=0;i<sales[0].length;i++){
			syoukei=sales[0][i]*sales[1][i];
			sum=sum+syoukei;
		}
		System.out.println("売上データ＝"+sum+"円です");
	}

}
