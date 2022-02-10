package Programmers;

public class p_And_y {
	boolean solution(String s) {
		s = s.toLowerCase();
		int count = 0;
		char[] c_arr = s.toCharArray();
		for (int i = 0; i < c_arr.length; i++)
			if (c_arr[i] == 'p')
				count++;
			else if (c_arr[i] == 'y')
				count--;
		return (count == 0) ? true : false;
	}
}
