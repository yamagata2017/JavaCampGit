package javacmp6syou;

public class MyClassTest13 {

	public static void main(String[] args){

	MyClass13 suzuki =new MyClass13("鈴木次郎",180,75,24);
	MyClass13 tanaka = new MyClass13("田中大輔",170,68,46);

	suzuki.gainWeight(3); //鈴木さんが3キロ太っちゃった
	tanaka.reduceWeight(2); //田中さんが2キロ痩せちゃった

	System.out.println
		("氏名:"+suzuki.getName()+" 身長:"+suzuki.getHeight()+
				"cm 体重:"+suzuki.getWeight()+"kg 年齢:"+suzuki.getAge()+"才");
	System.out.println
		("氏名:"+tanaka.getName()+" 身長:"+tanaka.getHeight()+
			"cm 体重:"+tanaka.getWeight()+"kg 年齢:"+tanaka.getAge()+"才");

	}
}
