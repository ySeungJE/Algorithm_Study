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
	
	public static void main(String[] args) {
		int[] arr = new int[2];
		Common_Number cn = new Common_Number();
		
		arr = cn.solution(2, 5);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
