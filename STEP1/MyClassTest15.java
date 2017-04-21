package javacmp6syou;

public class MyClassTest15 {

	public static void main(String[] args){

		MyClass15 x = new MyClass15(1,2,3);
		MyClass15 y = new MyClass15(2,4,6);

		int xsum  = x.getSum();
		int ysum = y.getSum();

		System.out.print("x:");
		x.print();
		System.out.println("xsum:"+xsum);

		System.out.print("y:");
		y.print();
		System.out.println("ysum:"+ysum);
	}
}
