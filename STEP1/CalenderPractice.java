package javacmp5syou;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int y=new Scanner(System.in).nextInt();
		int m=new Scanner(System.in).nextInt();
		int d=1;
		int d1=0;

 		Calendar cal =Calendar.getInstance();
		cal.set(Calendar.YEAR, y);
		cal.set(Calendar.MONTH,m-1);
		cal.set(Calendar.DAY_OF_MONTH,d);
		int w = cal.get(Calendar.DAY_OF_WEEK);
		int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println(days);
		System.out.println(w);

		d1=days;

		cal.set(Calendar.DATE,d1);

		String[] s={"日","月","火","水","木","金","土",};

		for(int i=0;i<s.length;i++){
			System.out.print("   "+s[i]);
		}
		System.out.println();

		int[] space ={0,0,0,0,0,0,0};
		int i=0;
		int w1=0;

		for(int j=w-1;j<space.length;j++){
			i++;
			space[j]=i;
		}
		//System.out.println(i);
		for(int j=0;j<space.length;j++){
			if(space[j]==0){
				System.out.print("      ");
			}
			else{
				System.out.printf("%5d",space[j]);
			}
		}
		for(int k=0;k<5;k++){
			if(i==d1){
				break;
			}
			else{
				for(int j=0;j<space.length;j++){
					if(i==d1){
						for(int l=0;l<space.length-j;l++){
							space[j]=0;
						}
					}
					else{
						i++;
						space[j]=i;
					}
				}
					System.out.println();
				for(int j=0;j<space.length;j++){
					if(space[j]==0){
						System.out.print("     ");
					}
					else if(space[j]<10){
						System.out.printf("%5d",space[j]);
					}
					else{
						System.out.printf("%4d",space[j]);
					}
				}
			}
		}
	}
}