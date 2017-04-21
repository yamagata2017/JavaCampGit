package javacmp6syou;

public class MyClass08 {

	static int myStatic =10;
	int myInstance = 100;
	public static void main(String[] args){
		myStatic =20;
		System.out.println(myStatic);
		MyClass08 obj = new MyClass08();
		obj.myInstance = 200;
		System.out.println(obj.myInstance);
	}
}
