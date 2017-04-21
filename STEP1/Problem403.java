package javacmp;

public class Problem403 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		char[] shamei ={'U','T','S','Y','S','T','E','M'};
		char[] kari = new char[8];
		int i=0;
		//for(int i=0;i<shamei.length;i++){
			//int b=(shamei.length-i-1);
			//System.out.print(shamei[i]);
			//shamei[i]=shamei[b];
			//System.out.println(shamei[i]);

		for(i=0;i<8;i++){
			//int j=7-i;
			int k=7-i;
			kari[i]=shamei[k];
		}
		for(i=0;i<8;i++){
			shamei[i]=kari[i];
			System.out.println(shamei[i]);
		}
	}

}
