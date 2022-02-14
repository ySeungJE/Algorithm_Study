package Programmers;

import java.time.LocalDate;

public class Get_Day {
	public static String solution(int a, int b) {
		LocalDate ld = LocalDate.of(2016,a,b);
		
		switch(ld.getDayOfWeek().getValue()){
		case 1 : return "MON";
		case 2 : return "TUE";
		case 3 : return "WED";
		case 4 : return "THU";
		case 5 : return "FRI";
		case 6 : return "SAT";
		case 7 : return "SUN";
		}
		return "";
	}
	public static void main(String[] args) {
		int a=5, b=24;
		System.out.println(Get_Day.solution(a, b));
	}
}
