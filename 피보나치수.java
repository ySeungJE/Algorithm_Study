package Programmers;

import java.math.*;

class 피보나치수 {
    public int solution(int n) {
        return fibonacci(n).remainder(new BigInteger("1234567")).intValue();
    }    
    public BigInteger fibonacci(int n) {
        BigInteger[] bi = new BigInteger[n+1];
	    bi[0] = new BigInteger("0");
	    bi[1] = new BigInteger("1");
	    for (int i = 2; i <= n; i++) {
	        bi[i] = bi[i - 1].add(bi[i - 2]);
	    }
	    return bi[n];
	}
}
