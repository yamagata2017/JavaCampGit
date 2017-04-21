package javacmp6syou;

public class MyClass04 {

	int a;
	int b;

	MyClass04(int x,int y){
		a =x;
		b = y;
	}
	public void calc(){
		System.out.println(a*b);
	}
	public int  calc(int var1){
		return a*var1;
	}
	public int calc(int var1,int var2){
		int answer =(var1+var2)*2;
		return answer;
	}
}
