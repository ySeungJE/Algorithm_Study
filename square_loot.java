package Programmers;

public class square_loot {
	static public long solution(long n) {
		Double d = Math.sqrt(n);
		return (d==d.intValue()) ? (long)(++d*d) : -1 ;
	}
}
