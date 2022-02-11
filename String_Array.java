package Programmers;

import java.util.Arrays;

public class String_Array {
	public static String[] solution(String[] strings, int n) {
		StringBuilder sb;
		String test;
		for (int i = 0; i < strings.length; i++) {
			sb = new StringBuilder();
			test = strings[i].substring(0, n);
			strings[i]=(sb.append(strings[i]).
					delete(0, n).append(test).toString());
		}
		Arrays.sort(strings);
		for(int i=0; i<strings.length; i++) {
			sb = new StringBuilder();
			test = strings[i].substring(0, strings[i].length()-n);
			strings[i]=(sb.append(strings[i]).
					delete(0, strings[i].length()-n).append(test).toString());
		}
		return strings;
	}
	public static void main(String[] args) {
		String[] strings = {"abce","bbcd","cdx"};
		strings = String_Array.solution(strings, 2);
		for(String s : strings) {
			System.out.println(s);
		}
	}
}
