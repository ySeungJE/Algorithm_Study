package Programmers;

import java.util.Arrays;

public class String_Array {
	public static String[] solution(String[] strings, int n) {
		String[] test = new String[strings.length];
		StringBuilder sb;
		for(int i=0; i<test.length; i++) 
			test[i] = ""+strings[i].charAt(n)+strings[i];
		Arrays.sort(test);
		for(int i=0; i<test.length; i++) {
			sb = new StringBuilder();
			test[i] = sb.append(test[i]).deleteCharAt(0).toString();
		}
		return test;
	}
}
