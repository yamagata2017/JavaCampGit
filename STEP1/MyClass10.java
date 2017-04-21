package javacmp6syou;

public class MyClass10 {

	private String name; //氏名
	private int height;     //身長
	private int weight;    //体重
	private double bmi; //BMI
	private String message; //判定結果
	//コンストラクタ

	public MyClass10(String name,int height,int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
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
	//BMIの計算の返却
	public double getBmi(){
		this.bmi=this.weight/Math.pow(height/100.0,2); //累乗
		return bmi;
	}
}
