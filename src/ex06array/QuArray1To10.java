package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		// 배열 요소 합을 구하기 위해 변수 선언, 0으로 초기화
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
		}
		// for문을 이용해 배열 요소 합 구하기
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("for문을 이용한 배열 요소의 합: " + sum);
		// foreach문을 이용해 배열 합 구하기
		sum = 0;
		for(int n : arr) {
			sum += n;
		}
		System.out.println("foreach문을 이용한 배열 요소의 합: " + sum);
	}

}
