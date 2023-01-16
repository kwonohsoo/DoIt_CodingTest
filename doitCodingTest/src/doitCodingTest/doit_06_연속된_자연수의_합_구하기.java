package doitCodingTest;

import java.util.Scanner;

public class doit_06_연속된_자연수의_합_구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 사용 변수 초기화
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		while (end_index != N) {
			if (sum == N) {				// 현재 연속 합이 N과 같은 경우
				count++;					// count 증가
				end_index++;			// end_index 증가
				sum += end_index;	// sum값 변경
			} else if (sum > N) {		// 현재 연속 합이 N보다 더 큰 경우
				sum -= start_index;	// sum값 변경
				start_index++;			// start_index 증가
			} else {							// 현재 연속 합이 N보다 작은 경우
				end_index++;			// end_index 증가
				sum += end_index;	// sum값 변경
			}
		}
		System.out.println(count);
	}

}
