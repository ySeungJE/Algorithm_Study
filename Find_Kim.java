package Programmers;

public class Find_Kim {
	public static String solution(String[] seoul) {
		int i;
		String s="";
		for(i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) 
				 s = "김서방은 "+i+"에 있다";
		}
		return s;
	}
}
