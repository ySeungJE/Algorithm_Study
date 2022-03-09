package Programmers;

import java.util.Arrays;

public class Budget {
	public int solution(int[] d, int budget) {
        int answer = 0, count=0;
        Arrays.sort(d);
        for(int i : d) {
        	answer+=i;
        	if(answer>budget) break;
        	count ++;
        }
        return count;
    }
}
