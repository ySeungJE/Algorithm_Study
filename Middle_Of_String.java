package Programmers;

public class Middle_Of_String {
	public static String Solution(String s) {
		return (s != null) ? s.substring((s.length()-1)/2,(s.length()+2)/2) : "";
	}
}
