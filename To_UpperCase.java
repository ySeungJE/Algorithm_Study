package Programmers;

/*
 * String answer = ""; String[] str_arr = s.split(" "); for(int i=0;
 * i<str_arr.length; i++) { String[] test = str_arr[i].split(""); for(int j=0;
 * j<test.length; j++) { if(j%2==0) answer+=test[j].toUpperCase(); else
 * answer+=test[j]; } answer+=" "; }
 */

public class To_UpperCase {
	public static String solution(String s) {
		char[] arr = s.toCharArray();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==' ') {
				count=0; continue;
			}
			if(count%2==0) 
				arr[i] = Character.toUpperCase(arr[i]);
			else if(count%2==1) 
				arr[i] = Character.toLowerCase(arr[i]);
			count++;
		}
		return String.valueOf(arr);
	}
	
	public static void main(String[] args) {
		String s="THE WORLD IS WHOLE new world";
		System.out.println(To_UpperCase.solution(s));
	}
}
