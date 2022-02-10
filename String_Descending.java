package Programmers;

import java.util.Arrays;

public class String_Descending {
	public static String solution(String s) {
		char[] c_arr = s.toCharArray();
		Arrays.sort(c_arr);
		StringBuilder sb = new StringBuilder();
		return sb.append(c_arr).reverse().toString();
	}
}
