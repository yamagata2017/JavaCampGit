package javacmp6syou;

public class MyClass12 {

	public String name; //氏名
	public int height;     //身長
	public int weight;    //体重
	public int age;         //年齢

	public MyClass12(String name,int height,int weight,int age){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public String getName(){
		return name;
	}
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return weight;
	}
	public int getAge(){
		return age;
	}
}
