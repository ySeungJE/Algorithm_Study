package Programmers;

public class Short_Money {
	public long solution(int price, int money, int count) {
		long answer=0;
        for(int i=1; i<=count;i++) {
        	answer+=price*i;
        }
        if(money-answer<0) 
        	return (money-answer)*-1;
        else
        	return 0;
    }
	public static void main(String[] args) {
		int price = 3, money=20, count=4;
	}
}
