package doitCodingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class doit_13_카드_게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		int n = sc.nextInt(); // n 카드의 개수, muQueue 카드 저장 자료구조
		for (int i = 0; i <= n; i++) { // 카드의 개수만큼 반복
			myQueue.add(i); // 큐에 카드 저장하기

		}
		while (myQueue.size() > 1) { // 카드가 1장 남을 때까지
			myQueue.poll(); // 맨 위의 카드를 버림 : poll()
			myQueue.add(myQueue.poll()); // 맨 위의 카드를 가장 아래의 카드 밑으로 이동 : poll() -> add()
		}
		System.out.println(myQueue.poll()); // 마지막으로 남은 카드 출력
	}

}
