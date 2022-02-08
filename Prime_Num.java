package Programmers;

public class Prime_Num {
	public static int solution(int n) {
		int answer=0;
		boolean[] b_arr = new boolean[n+1];
		for(int i=2; i<=n; i++) {
			if(b_arr[i]==true) continue;
			for(int j=i*2; j<=n; j+=i) {
				b_arr[j]=true;
			}
		}
		for(int i=2; i<b_arr.length; i++)
			if(b_arr[i]==false)
				answer++;
		return answer;
	}
}
