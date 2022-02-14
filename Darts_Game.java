package Programmers;

public class Darts_Game {
	public int solution(String dartResult) {
		if(dartResult.contains("10")) {
			dartResult = dartResult.replace("10", "@");
		}
		char[] dart_arr = dartResult.toCharArray();
		int[] score = new int[3];
		int loop = 0,answer=0;
		
		for(int i=0; i<dart_arr.length; i++) {
			if((int)dart_arr[i]>=48&&(int)dart_arr[i]<=57) {
				score[loop++] = Integer.parseInt(String.valueOf(dart_arr[i]));
			}
			else if((int)dart_arr[i]==64) {
				score[loop++] = 10;
			}
			else if((int)dart_arr[i]==83) {
				continue;
			}
			else if((int)dart_arr[i]==68) {
				int j=loop-1;
				score[j] = score[j]*score[j];
			}
			else if((int)dart_arr[i]==84) {
				int j=loop-1;
				score[j] = score[j]*score[j]*score[j];
			}
			else if((int)dart_arr[i]==42) {
				if(loop==1) {
					score[loop-1] = score[loop-1]*2;
				}
				else {
					score[loop-1] = score[loop-1]*2;
					score[loop-2] = score[loop-2]*2;
				}
			}
			else if((int)dart_arr[i]==35) {
				score[loop-1] = score[loop-1]*-1;
			}
		}
		for(int i=0; i<3;i++) {
			answer += score[i];
		}
		return answer;
	}
}
