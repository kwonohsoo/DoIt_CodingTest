package doitCodingTest;

import java.util.Scanner;
import java.util.Stack;

public class doit_11_스택으로_오름차순_수열_만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n 수열 개수, a[] 수열 배열
		int[] a = new int[n]; // 수열 배열 채우기

		for (int i = 0; i < n; i++) { // n만큼 반복
			a[i] = sc.nextInt();
		}

		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		int num = 1; // 오름차순 수
		boolean result = true;

		for (int i = 0; i < a.length; i++) {
			int su = a[i]; // 현재 수열의 수

			if (su >= num) { // 현재 수열의 값 >= 오름차순 자연수 : 값이 같아질 때까지 push() 수행
				while (su >= num) { // 값이 같아질 때까지
					stack.push(num++);
					bf.append("+\n"); // push (+) 저장
				}

				stack.pop();
				bf.append("-\n"); // pop (-)저장

			} else { // 현재 수열 값 < 오름차수누 자연수 : pop()을 수행해 수열 원소를 꺼냄
				int n1 = stack.pop(); // 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음

				if (n > su) { // 스택 pop 결과값 > 수열의 수 NO 출력
					System.out.println("NO");
					result = false;
					break;

				} else {
					bf.append("-\n"); // (-) 저장
				}
			}
		}
		if (result) {
			System.out.println(bf.toString()); // if(NO 값을 출력한 적이 없으면) 저장한 값 출력
		}

	}

}
