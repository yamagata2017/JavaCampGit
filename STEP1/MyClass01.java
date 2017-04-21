package javacmp6syou;

public class MyClass01 {

	int v1;
	int v2;

	public void add01(){
		System.out.println(v1*v2);
	}
	public void calc01(int a,int b){
		System.out.println(a*b);
	}
	public String addcalc01(int x,int y){
		String answer = "正解は"+(x+y);
		return answer;
	}
	public int getV1() {
		return v1;
	}
	public void setV1(int v1) {
		this.v1 = v1;
	}
	public int getV2() {
		return v2;
	}
	public void setV2(int v2) {
		this.v2 = v2;
	}

}
