package javacmp;

import java.util.Scanner;

public class Problem414 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int money =0;//投入金額
		int[][] oturi={{500,100,50,10},new int[4]};
		int[][] hanbaiki ={{500,100,50,10},{1,1,1,1}};//自販機内の硬貨の枚数
		int [] coin ={500,100,50,10};
		int[] n=new int[4];
		int[] nOturi=new int[4];
		int sum=0;

		for(int i=0;i<4;i++){
			n[i]=new Scanner(System.in).nextInt();
			money=money+coin[i]*n[i];
			hanbaiki[1][i]=hanbaiki[1][i]+n[i];
			//System.out.println(hanbaiki[1][i]);
		}
		//System.out.println(money);

		if(money<150){
			System.out.println("投入金が足りません。");
		}
		sum=money-150;

		for(int i=0;i<4;i++){
			for(int j=0;j<10;j++){
				if(sum<coin[i]){
					break;
				}
				else{
					sum=sum-coin[i];
					//System.out.println(sum);
					//System.out.println(hanbaiki[1][i]);
					if(hanbaiki[1][i]==0){
						break;
					}
					else{
						hanbaiki[1][i]=hanbaiki[1][i]-1;
						oturi[1][i]=oturi[1][i]+1;
						nOturi[i]++;
					}
				}
			}
		}
		if(sum==0){
			for(int i=0;i<4;i++){
				System.out.print(oturi[1][i]+" ");
			}
		}
		else{
			for(int i=0;i<4;i++){
				hanbaiki[1][i]=hanbaiki[1][i]+nOturi[i]-n[i];
			}
			System.out.println("お釣りが足りません。");
		}
	}

}
