package Programmers;

import java.math.BigInteger;

public class Common_Number {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		BigInteger b1 = BigInteger.valueOf(n);
		BigInteger b2 = BigInteger.valueOf(m);
		answer[0] = b1.gcd(b2).intValue();
		answer[1] = (n*m)/answer[0];
		return answer;
	}
}
