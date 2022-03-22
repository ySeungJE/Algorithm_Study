package Programmers;

import java.util.*;
class ����_ū_�� {
    public String solution(int[] numbers) {
        String answer = "";

        String[] str = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }     

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b); // �տ����� �� ũ�� ���(a�� �ڷ�), �ڿ����� ũ�� ����(a�� ������)
            }
        });

        //0���� �ߺ��ϰ�� ex){0,0,0}
        //���� 000�� ������ �ȵǹǷ� ù��°���� 0�̸� 0�� ����
        if (str[0].equals("0")) return "0";

        //0�� �ƴϸ� ���ڿ��� �����ش�.
        for(String s: str) answer += s;

        return answer;
    }
}
