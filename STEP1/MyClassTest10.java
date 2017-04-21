package javacmp6syou;

public class MyClassTest10 {

	public static void main(String[] args) {

		MyClass10[] bmi = new MyClass10[5];
		bmi[0]= new MyClass10("鈴木一郎",180,65);
		bmi[1]= new MyClass10("田中大輔",170,69);
		bmi[2]= new MyClass10("山田花子",165,45);
		bmi[3]= new MyClass10("村田裕子",169,50);
		bmi[4]= new MyClass10("早川紀子",140,46);
		for(int i=0;i<bmi.length;i++){
			System.out.printf("%s   %d   %d   %.2f\n",
					bmi[i].getName(),bmi[i].getHeight(),bmi[i].getWeight(),bmi[i].getBmi());
		}
	}

}
