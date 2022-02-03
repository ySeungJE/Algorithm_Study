package Programmers;

import java.util.Arrays;

public class Reverse_Number {
	public static int[] solution(long n) {
		StringBuilder sb = new StringBuilder(Long.valueOf(n).toString()).reverse();
		return Arrays.stream((sb.toString().split(""))).mapToInt(s->Integer.parseInt(s)).toArray();
	}
}
