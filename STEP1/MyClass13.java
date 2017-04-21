package javacmp6syou;

public class MyClass13 {

	private String name; //氏名
	private int height;     //身長
	private int weight;    //体重
	private int age;         //年齢
	//コンストラクタ

	public MyClass13(String name,int height,int weight,int age){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	public int gainWeight(int x){
		this.weight +=x;
		return weight;
	}
	public int reduceWeight(int x){
		this.weight -=x;
		return weight;
	}
	//getterとsetter
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
