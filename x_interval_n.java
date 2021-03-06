package Programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

class x_interval_n {
	long[] solution(int x, int n) {
		long[] array = new long[n];
		IntStream.range(1, n+1).forEach(i->array[i-1]=(long)x*(long)(i));
		return array;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,n;
		x_interval_n xn = new x_interval_n();
		x=sc.nextInt();
		n=sc.nextInt();
		
		long[] array = xn.solution(x,n);
		
		IntStream.range(0, n).forEach(i->System.out.println(array[i]));
	}
}
