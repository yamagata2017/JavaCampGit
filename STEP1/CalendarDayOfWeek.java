package javacmp5syou;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDayOfWeek {

	private static final int[] WEEK={
				Calendar.SUNDAY,
				Calendar.MONDAY,
				Calendar.TUESDAY,
				Calendar.WEDNESDAY,
				Calendar.THURSDAY,
				Calendar.FRIDAY,
				Calendar.SATURDAY
	,};
	private static final String[]WEEK_JA=
		{"日","月","火","水","木","金","土","日",};
	
	public static void main(String[] args){

		CalendarDayOfWeek ct = new CalendarDayOfWeek();

		System.out.println("年:");
		int y =new Scanner(System.in).nextInt();

		System.out.println("月:");
		int m = new Scanner(System.in).nextInt();

		System.out.println("日:");
		int d = new Scanner(System.in).nextInt();

		String day = ct.getDayOfWeek(y,m,d);

		System.out.println(y+"/"+m+"/"+d+"は"+day+"曜日です。");
	}
	public String getDayOfWeek(int y,int m,int d){

		Calendar cal =Calendar.getInstance();
		cal.set(Calendar.YEAR, y);
		cal.set(Calendar.MONTH,m-1);
		cal.set(Calendar.DAY_OF_MONTH,d);
		int w = cal.get(Calendar.DAY_OF_WEEK);
		for(int i = 0;i<CalendarDayOfWeek.WEEK.length;i++){
			if(w==CalendarDayOfWeek.WEEK[i]){
				return CalendarDayOfWeek.WEEK_JA[i];
			}
		}
		return null;

	}

}


