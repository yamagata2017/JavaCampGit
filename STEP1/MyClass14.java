package javacmp6syou;

public class MyClass14 {

	private String name;
	private int no;
	private int age;

	MyClass14(String name,int no,int age){
		this.name = name;
		this.no = no;
		this.age = age;
	}
	int getNo(){
		return no;
	}
	void setNo(int no){
		this.no = no;
	}
	void print(){
		System.out.println("No."+no+":"+name+":"+age+"才");
	}
}

