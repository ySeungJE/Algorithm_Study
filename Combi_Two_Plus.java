package Programmers;

import java.util.Set;
import java.util.TreeSet;

public class Combi_Two_Plus {
	static Set<Integer> set = new TreeSet<>();
	
	public static void main(String[] args) {
		int[] arr = {5,0,2,7};
		for(int i : solution(arr)) {
			System.out.print(i+" ");
		}
	}

	public static int[] solution(int[] numbers) {
        boolean[] visited = new boolean[numbers.length];
        Combi_Two_Plus.combination(numbers, visited, numbers.length, 2, 0);
        return set.parallelStream().mapToInt(i->i).toArray();
    }
	
	static void combination(int[] arr, boolean[] visited, int n, int r, int start) {
		if(r==0) {
			int sum=0;
			for(int i=0; i<n; i++) {
				if(visited[i]==true)
					sum+=arr[i];
			}
			set.add(sum);
			return;
		}
		
		for(int i=start; i<n; i++) {
			if(visited[i]==false) {
				visited[i]=true;
				combination(arr, visited, n, r-1, i);
				visited[i]=false;
			}
		}
	}
}

