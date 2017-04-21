package javacmp6syou;

public class MyClass11 {

	private String name; //氏名
	private int height;     //身長
	private int weight;    //体重
	private double bmi; //BMI
	private String message; //判定結果
	//コンストラクタ

	public MyClass11(String name,int height,int weight){
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
	public void getMsg(double bmi){

		if(bmi<18.5){
			this.message ="やせすぎ";
		}
		else if(bmi<25.0){
			this.message ="標準";
		}
		else if(bmi<30.0){
			this.message ="肥満（１度）";
		}
		else if(bmi<35.0){
			this.message ="肥満（2度）";
		}
		else if(bmi<40.0){
			this.message ="肥満（3度）";
		}
		else{
			this.message ="肥満（4度）";
		}
		System.out.println(message);
	}
}
