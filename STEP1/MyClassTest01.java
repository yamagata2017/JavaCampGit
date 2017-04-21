package javacmp6syou;

public class MyClassTest01 {

	public static void main(String[] args){

		MyClass01 mc = new MyClass01();
		mc.v1=100;
		mc.v2=200;
		int a=300;
		int b=400;
		int x=500;
		int y=600;

		mc.add01();
		mc.calc01(a, b);
		String s =mc.addcalc01(x, y);
		System.out.println(s);
	}
}
