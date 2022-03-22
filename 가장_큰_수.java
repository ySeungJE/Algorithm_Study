package Programmers;

import java.util.*;
class 가장_큰_수 {
    public String solution(int[] numbers) {
        String answer = "";

        String[] str = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }     

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b); // 앞에꺼가 더 크면 양수(a가 뒤로), 뒤에꺼가 크면 음수(a가 앞으로)
            }
        });

        //0값이 중복일경우 ex){0,0,0}
        //답이 000이 나오면 안되므로 첫번째값이 0이면 0을 리턴
        if (str[0].equals("0")) return "0";

        //0이 아니면 문자열을 더해준다.
        for(String s: str) answer += s;

        return answer;
    }
}
