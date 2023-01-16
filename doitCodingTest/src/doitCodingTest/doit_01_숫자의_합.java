package doitCodingTest;

import java.util.Scanner;

public class doit_01_숫자의_합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String sNum = sc.next();	// 입력값을 String sNum에 입력
		char[] cNum = sNum.toCharArray();	// char[]로 변환
 
		int sum = 0;

		for (int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - 48;	// 문자를 숫자로 변환하려면 아스키코드 "0" = 48 빼면 된다.
		}
		System.out.println(sum);

	}

}