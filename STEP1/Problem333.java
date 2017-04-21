package javacmp;

public class Problem333 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n=0;

		for(int i=0;i<50;i++){
			n=i+1;
			if(n%15==0){
				System.out.print("FizzBuzz ");
			}
			else if(n%5==0){
				System.out.print("Buzz ");
			}
			else if(n%3==0){
				System.out.print("Fizz ");
			}
			else{
				System.out.print(n+" ");
			}
		}
	}

}
