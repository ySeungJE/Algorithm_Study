package Programmers;

public class Number_Sum {
	public static int solution(int n) {
		int answer=0;
		String[] arr =  Integer.valueOf(n).toString().split("");
		for(String s : arr) 
			answer += Integer.parseInt(s);
		return answer;
	}
}
