package Programmers;

public class Smallest_Ractangle {
	public int solution(int[][] sizes) {
        int Max1=Integer.MIN_VALUE, Max2 = Integer.MIN_VALUE; 
        for(int i=0; i<sizes.length; i++) {
        	if(sizes[i][0]>=sizes[i][1]) continue;
        	int test;
        	test = sizes[i][0];
        	sizes[i][0] = sizes[i][1];
        	sizes[i][1] = test;
        }
        for(int i=0; i<sizes.length; i++) {
        	if(sizes[i][0]<Max1)
        		Max1 = sizes[i][0];
        	if(sizes[i][1]<Max2)
        		Max2 = sizes[i][1];
        }
        return Max1*Max2;
    }
}	
