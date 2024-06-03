package ex05method;

import java.util.Scanner;

public class QuFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("3 이상의 숫자를 입력하세요.");
		int n = scanner.nextInt();
		fibonacciProgression(n);
	}
	
	// 배열로 구현
	public static void fibonacciProgression(int n) {
		if(n <= 2) {
			System.out.println("피보나치 수열은 0, 1로 시작하므로 "
					+ "3부터 입력해주세요.");
			return;
		}
		// 배열의 크기가 있는 정수형 배열 생성
		int arr[] = new int[n];
		
		// 피보나치 배열은 첫번째 인덱스가 0, 두번째 인덱스가 1이므로 초기화
		arr[0] = 0;
		arr[1] = 1;
		
		// 세번째 인덱스부터 계산하는 반복문
		for(int i = 2; i < n; i++) {
			// i번째 인덱스의 값 = 해당 인덱스 두 칸 앞 인덱스의 값 + 한 칸 앞 인덱스의 값
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		
		// 로직이 완성된 피보나치 배열 출력
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
}
