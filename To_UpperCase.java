package Programmers;

public class To_UpperCase {
	public static String solution(String s) {
		char[] arr = s.toCharArray();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==' ') {
				count=0; continue;
			}
			if(count%2==0) 
				arr[i] = Character.toUpperCase(arr[i]);
			else if(count%2==1) 
				arr[i] = Character.toLowerCase(arr[i]);
			count++;
		}
		return String.valueOf(arr);
	}
}
