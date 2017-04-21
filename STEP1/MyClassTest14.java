package javacmp6syou;

import java.util.Scanner;

public class MyClassTest14 {

	public static void main(String[] args) {

		String name = new Scanner(System.in).nextLine();
		int no = new Scanner(System.in).nextInt();
		int age = new Scanner(System.in).nextInt();

		MyClass14 mc = new MyClass14(name,no,age);

		mc.print();

	}

}
