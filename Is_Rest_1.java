package Programmers;

public class Is_Rest_1 {
	public int solution(int n) {
		int i;
		for (i = 2; i < n; i++)
			if (n % i == 1)
				break;
		return i;
	}
}
