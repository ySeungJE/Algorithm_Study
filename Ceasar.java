package Programmers;

public class Ceasar {
	public static String solution(String s, int n) {
		char[] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=65&&arr[i]<=90) {
				if(arr[i]+n>90)
					arr[i] -= 25-(n-1);
				else
					arr[i] += n;
			}
			else if(arr[i]>=97&&arr[i]<=122) {
				if(arr[i]+n>122)
					arr[i] -= 25-(n-1);
				else
					arr[i] += n;
			}
		}
		return String.valueOf(arr);
	}
}
