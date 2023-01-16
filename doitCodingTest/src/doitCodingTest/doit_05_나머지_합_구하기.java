package doitCodingTest;

import java.util.Scanner;

public class doit_05_나머지_합_구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 수열의 개수
		int M = sc.nextInt();	// 나누어떨어져야 하는 수

		long[] S = new long[N]; // 합 배열 선언
		long[] C = new long[M];	// 같은 나머지의 인덱스를 카운트하는 배열 선언

		long answer = 0;	// answer 변수 선언, 초기화

		S[0] = sc.nextInt();	// 배열 시작

		for (int i = 1; i < N; i++) {		// N개의 수 
			S[i] = S[i - 1] + sc.nextInt();	// 합 배열 저장

		}
		for (int i = 0; i < N; i++) {
			int remainder = (int) (S[i] % M);	// 합 배열을 M으로 나눈 나머지 값, 합 배열의 모든 값에 % 연산 수행
			if (remainder == 0) {
				answer++;	// 나머지가 0일 때 정답에 더하기
			}
			C[remainder]++;	// 나머지가 같은 인덱스의 개수 카운팅
		}
		for (int i = 0; i < M; i++) {
			if (C[i] > 1) {
				answer = answer + (C[i] * (C[i] - 1) / 2);	// 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
			}

		}
		System.out.println(answer);

	}

}
