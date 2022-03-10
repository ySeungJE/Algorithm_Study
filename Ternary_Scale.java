package Programmers;

public class Ternary_Scale {
	public int solution(int n) {
        int answer = 0, c=1, count = 0, b=0;
        StringBuilder sb = new StringBuilder();
        while(true) {
        	if(n/c==0) {
        		while(c!=1) {
        			c/=3; 
        			answer = n/(c); 
        			n %= (c); 
        			sb.append(String.valueOf(answer)); 
        		}
        		break;
        	}
        	c*=3;
        	count++;
        }
        answer = 0;
        sb.reverse();
        String[] s_arr = sb.toString().split("");
        for(int i=s_arr.length; i>0; i--) {
        	int a=1;
        	for(int j=1; j<i; j++) {
        		a*=3;
        	}
        	answer += a*Integer.parseInt(s_arr[b++]);
        }
        return answer;
    }
}
