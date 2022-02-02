package Programmers;

public class Collatz {
	public int solution(int num) {
		int count=0;
		while(num!=1&&count<500){
			if(num%2==0) {
				num/=2;
			}
			else if(num%2==1) {
				num = (num*3)+1;
			}
			count++;
		}
		if(count==500)
			return -1;
		else
			return count;
	}
}
