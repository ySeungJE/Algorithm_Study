package Programmers;

import java.util.*;
class ¿Ã¹Ù¸¥_°ýÈ£ {
	public static void main(String[] args) {
		String s = "()()";
		System.out.println(solution(s));
	}
    static boolean solution(String s) {

        Stack<Integer> stack = new Stack<>();
        String[] s_arr = s.split("");
    
        for(String st : s_arr) {
            if(st=="(") stack.push(1);
            else {
                if(stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        return (stack.isEmpty()) ? true : false;
    }
}
