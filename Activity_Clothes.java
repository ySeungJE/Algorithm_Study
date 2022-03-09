package Programmers;

import java.util.Arrays;

public class Activity_Clothes {	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] stu = new int[n];
        Arrays.fill(stu, 1);
        
        for(int i : lost) {
        	stu[i-1]-=1;
        }
        for(int i : reserve) {
        	stu[i-1]+=1;
        }
        
        for(int i=0; i<n; i++) {
        	if(stu[i]==2) {
        		if(i>0&&stu[i-1]==0) {
        			stu[i]--;
        			stu[i-1]++;
        		}
        		else if(i<4&&stu[i+1]==0) {
        			stu[i]--;
        			stu[i+1]++;
        		}
        	}
        }
        
        for(int i :stu) {
        	if(i>0) answer++;
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] lost = {3};
		int[] reserve = {1};
		System.out.println(solution(3,lost,reserve));
	}
}
