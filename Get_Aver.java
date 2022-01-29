package Programmers;

import java.util.stream.IntStream;

public class Get_Aver {
	public double solution(int[] arr) {
		double answer;
		answer = IntStream.of(arr).average().getAsDouble();
		return answer;
	}
}

/* public class Get_Aver {
	public double solution(int[] arr) {
		double answer;
		int sum=0;
		for(int i=0; i<arr.length; i++) 
			sum+=arr[i];
		answer = (double)sum / arr.length;
		return answer;
	}
} */
