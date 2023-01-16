package doitCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class doit_07_주몽 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());	// 재료의 개수
		int M = Integer.parseInt(bf.readLine());	// 갑옷이 되는 번호
		int[] A = new int[N];	// 배열에 저장
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < N; i++) {		// N만큼 반복
			A[i] = Integer.parseInt(st.nextToken());	// 재료 배열 저장
		}
		Arrays.sort(A);	// 재료 배열 오름차순 정렬
		int count = 0;
		int i = 0;
		int j = N - 1;
		
		// A[i] + A[j] > M : j--;		번호의 합이 M보다 크므로 큰 번호 index를 내린다.
		// A[i] + A[j] < M : i++;		번호의 합이 M보다 작으므로 작은 번호 index를 올린다.
		// A[i] + A[j] == M : i++; j--; count++;		양쪽 포인터를 모두 이동시키고 count를 증가시킨다.
		
		while (i < j) {							// 투 포인터 이동 원칙 따라 포인터를 이동하며 처리
			if (A[i] + A[j] < M) {				// 재료 합 < M 작은 번호 재료를 한 칸 위로 변경하기
				i++;
			} else if (A[i] + A[j] > M) {		// 재료 합 > M 큰 번호 재료를 한 칸 아래로 변경하기
				j--;
			} else {									// 경우의 수 증가, 양쪽 index 각각 변경하기
				count++;
				i++;
				j--;
			}
		}												// i와 j가 만날 때까지 반복, 반복 끝나면 count 출력
		System.out.println(count);
		bf.close();

	}

}
