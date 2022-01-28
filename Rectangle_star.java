package Programmers;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Rectangle_star {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n, m;

		n = sc.nextInt();
		m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				bw.write('*');
			}
			bw.write('\n');
		}
		bw.flush();
		bw.close();
	}
}

/* 
StringBuilder를 이용해서 작업. 반복문은 for대신 IntStream으로 사용
import java.util.Scanner;
import java.util.stream.IntStream;

public class stringbuilder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		IntStream.range(0, a).forEach(i->sb.append('*'));
		IntStream.range(0, b).forEach(i->System.out.println(sb.toString()));
	}
}
*/
 