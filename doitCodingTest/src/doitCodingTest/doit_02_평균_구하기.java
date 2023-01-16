package doitCodingTest;

import java.util.Scanner;

public class doit_02_평균_구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < A.length; i++) {	// 0, 1, 2
			A[i] = sc.nextInt();					// 40, 80, 60
		}
		long sum = 0;	// 소수점 표현하기 위해 long 변수 선언, 초기화
		long max = 0;
		for (int i = 0; i < A.length; i++) {	// 0, 1, 2
			if (A[i] > max) {
				max = A[i];	// 최고점은 max 80
			}
			sum += A[i];		// 총점은 sum 180
		}
		System.out.println(sum * 100.0 / max / N);	// (A / M * 100 + B / M * 100 + C / M * 100) / 3 = (A + B + C) * 100 / M / 3 
	}

}
