package doitCodingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class doit_12_오큰수_구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 수열 개수
		int A[] = new int[n]; // 수열 배열
		int[] ans = new int[n]; // 정답 배열
		String[] str = bf.readLine().split(" ");

		for (int i = 0; i < n; i++) { // n만큼 반복
			A[i] = Integer.parseInt(str[i]);
		}

		Stack<Integer> myStack = new Stack<>(); // 최초 스택 초기화
		myStack.push(0); // 처음에는 항상 스택이 비어 있으므로 최초 값을 push해 초기화

		for (int i = 0; i < n; i++) { // 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
			while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) { // 정답 배열에 오큰수를 현재 수열로 저장하기
				ans[myStack.pop()] = A[i];
			}
			myStack.push(i); // 신규 데이터 i push
		}
		while (!myStack.empty()) { // 반복문을 다 돌고 나왔는데 스택이 비어 있지 않다면 빌 때까지
			ans[myStack.pop()] = -1; // 스택에 쌓인 index에 -1을 넣는다
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < n; i++) {
			bw.write(ans[i] + " "); // 장딥 배열 출력

		}
		bw.write("\n");
		bw.flush();

	}

}
