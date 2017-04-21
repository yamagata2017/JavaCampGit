package javacmp5syou;

class Craps {

	public static int diceRoll(){

		int sum=0;

		for(int i=0;i<2;i++){
			int dice = new java.util.Random().nextInt(6)+1;
			sum = sum + dice;
		}
		return sum;
	}

	public static void main(String[] args) {

		//System.out.println(diceRoll());
		int sum = diceRoll();

		System.out.println("1回目:"+sum);

		if(sum==7 || sum==11){
			System.out.println("you win");
		}
		else if(sum==2 || sum==3 || sum==12){
			System.out.println("you lose");
		}
		else{

			for(int i=0;i<1000;i++){

				int sum1 =sum;
				sum = diceRoll();

				//System.out.println(i+"回目:"+sum1);
				System.out.println((i+2)+"回目:"+sum);

				if(sum1==sum){
					System.out.println("you win");
					break;
				}
				else if(sum==7){
					System.out.println("you lose");
					break;
				}
			}
		}
	}

}
