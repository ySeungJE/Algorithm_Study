package Programmers;

import java.util.Arrays;

public class Reverse_Number {
	public static int[] solution(long n) {
		StringBuilder sb = new StringBuilder(Long.valueOf(n).toString()).reverse();
		return Arrays.stream((sb.toString().split(""))).mapToInt(s->Integer.parseInt(s)).toArray();
	}
	public static void main(String[] args) {
		long n = 12345;
		for(int i : Reverse_Number.solution(n)) {
			System.out.println(i);
		}
	}
}
