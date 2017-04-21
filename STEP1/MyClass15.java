package javacmp6syou;

public class MyClass15 {

	private int a;
	private int b;
	private int c;

	MyClass15(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int getSum(){
		return a+b+c;
	}
	void print(){
		System.out.println("a="+a+"b="+b+"c="+c);
	}
}
