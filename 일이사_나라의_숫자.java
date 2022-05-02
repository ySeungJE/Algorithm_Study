package Programmers;

class 일이사_나라의_숫자 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n!=0) {
            if(n%3==1) {
                sb.insert(0, "1");
                n = n/3;
            }
            else if(n%3==2) {
                sb.insert(0, "2");
                n = n/3;
            }
            else {
                sb.insert(0, "4");
                n = n/3-1;
            }
        }
        return sb.toString();
    }
}
