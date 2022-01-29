package Programmers;

public class harshad {
	public boolean solution(int x) {
		int a=1, b=10, sum=0;
		for(int i=0; i<4; i++) {
			sum+=(x%b)/a;
			if((x%b)==x) break;
			a*=10;
			b*=10; 
		}
		return (x%sum)==0;
	}
}
