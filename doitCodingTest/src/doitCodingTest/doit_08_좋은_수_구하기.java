package doitCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class doit_08_좋은_수_구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); // 수의 개수
		int Result = 0;
		long A[] = new long[N]; // 수 데이터 저장 배열
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < N; i++) { // N만큼 반복하기
			A[i] = Long.parseLong(st.nextToken()); // A 배열에 데이터 저장하기
		}
		Arrays.sort(A); // A 배열 정렬하기
		for (int k = 0; k < N; k++) { // k를 0부터 N까지 반복
			long find = A[k];
			int i = 0; // 변수 초기화하기(찾고자 하는 값 find, 포인터 i, 포인터 j)
			int j = N - 1; // 투 포인터 알고리즘
			while (i < j) {
				if (A[i] + A[j] == find) { // find == 찾고자 하는 값 // find는 서로 다른 두 수의 합이어야 함
					if (i != k && j != k) { // 두 포인터 i, j 가 k가 아닐 때 결괏값에 반영 및 while 문 종료하기
						Result++; // 두 포인터 i, j 가 맞을 때 포인터 변경 및 계속 수행하기
						break;
					} else if (i == k) {
						i++;
					} else if (j == k) {
						j--;
					}
				}
			}
		}
		System.out.println(Result);
		bf.close();

	}

}
