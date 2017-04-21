package javacmp6syou;

public class MyClassTest11 {

	public static void main(String[] args) {

		MyClass11[] bmi = new MyClass11[5];
		bmi[0]= new MyClass11("鈴木一郎",180,65);
		bmi[1]= new MyClass11("田中大輔",170,69);
		bmi[2]= new MyClass11("山田花子",165,45);
		bmi[3]= new MyClass11("村田裕子",169,50);
		bmi[4]= new MyClass11("早川紀子",140,46);
		for(int i=0;i<bmi.length;i++){
			System.out.printf("%s   %d   %d   %.2f ",
					bmi[i].getName(),bmi[i].getHeight(),bmi[i].getWeight(),bmi[i].getBmi());
			bmi[i].getMsg(bmi[i].getBmi());
		}
	}


}
