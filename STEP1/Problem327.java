package javacmp;

public class Problem327 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int n=5;

		for(int i=1;i<=5;i++){

			for(int j=i;j<=n-1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print(i);

			}
			System.out.println();
		}
	}

}
