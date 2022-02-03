package Programmers;

import java.util.Arrays;

public class Descending_Order {
	static long solution(long n) {
		StringBuilder sb = new StringBuilder();
        char[] char_arr = Long.toString(n).toCharArray();
        Arrays.sort(char_arr);
        sb.append(String.valueOf(char_arr));
        return Long.parseLong(sb.reverse().toString());
	}
}
