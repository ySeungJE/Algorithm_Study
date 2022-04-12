package Programmers;

import java.util.*;
class ���ڿ�_���� {
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
                    if(count!=1)  // ��ģ�� �ִµ� ���� ���
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
                    if(s.substring(i, i+n).equals(deq.peekLast())) { // ���� ���ڿ��� �ٷ� �� ���ڿ��� ���� ���
                        count++; // count�� ����
                        i+=n;  // ���� ���ڿ��� �Ѿ
                    }
                    else { // �ٷ� �� ���ڿ��� �ٸ� ���
                        if(count==1) { //��ģ�� �ƹ��͵� ���� ���
                            deq.offerLast(s.substring(i, i+n));
                            i+=n;
                        }
                        else { // ��ģ ���ڿ��� �ϳ� �̻��� ���
                            deq.offerFirst(String.valueOf(count)); // �ƹ��ų� ��� ������
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
