package Programmers;

public class Find_Kim {
	public static String solution(String[] seoul) {
		int i;
		String s="";
		for(i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) 
				 s = "�輭���� "+i+"�� �ִ�";
		}
		return s;
	}
}
