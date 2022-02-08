package Programmers;

public class four_or_six_String {
	public static boolean solution(String s) {
		int len = s.length();
		char[] c_arr = s.toCharArray();
		for(char c:c_arr) {
			if((c>=49&&c<=57)==false)
				return false;
		}
		return (len==4||len==6) ? true : false;
	}
}
