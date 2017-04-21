package javacmp;

public class Problem404 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] data={8,7,6,5,4,3,2};//N=8

		for(int i=0;i<6;i++){


			for(int j=0;j<6;j++){
				if(data[j]>data[j+1]){
					int w=data[j];
					data[j]=data[j+1];
					data[j+1]=w;
				}
			}
		}
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}

	}

}
