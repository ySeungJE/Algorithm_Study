package Programmers;

import java.util.*;
class 문자열_압축 {
    public static int solution(String s) {
        int answer = Integer.MAX_VALUE, temp=0;
        if (s.length()==1) return 1;
        for(int i=1; i<=s.length()/2; i++) {
            temp = compression(s, i);
            if(answer > temp) answer = temp;
        }
        return answer;
    }
    public static int compression(String s, int n) {
        Deque<String> deq = new ArrayDeque<>();
        int count=1, i=0;
        boolean loop_check = true; 
        while(loop_check) {
            if(i+n>s.length()) {
                if(i==s.length()) {
                    if(count!=1) 
                        deq.offerFirst(String.valueOf(count));
                    loop_check = false;
                }
                else {
                    if(count!=1)  // 겹친게 있는데 끝난 경우
                        deq.offerFirst(String.valueOf(count));
                    deq.offerLast(s.substring(i, s.length()));
                    loop_check = false;
                }
            }
            else {
                if(deq.isEmpty()) {
                    deq.offerLast(s.substring(i, i+n));
                    i+=n;
                }
                else {
                    if(s.substring(i, i+n).equals(deq.peekLast())) { // 넣을 문자열과 바로 앞 문자열이 같을 경우
                        count++; // count를 증가
                        i+=n;  // 다음 문자열로 넘어감
                    }
                    else { // 바로 앞 문자열과 다를 경우
                        if(count==1) { //겹친게 아무것도 없을 경우
                            deq.offerLast(s.substring(i, i+n));
                            i+=n;
                        }
                        else { // 겹친 문자열이 하나 이상일 경우
                            deq.offerFirst(String.valueOf(count)); // 아무거나 상관 없을듯
                            deq.offerLast(s.substring(i, i+n));
                            i+=n; count = 1;
                        }
                    }
                }
            }
        }

        int result = 0;
        for(String s1 : deq) 
            result += s1.length();

        return result;
    }
}
