package ex06array;

import java.util.Scanner;

/*
 * 문제3) 홀수/짝수 구분하여 배열채우기
   길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
   그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 
   배열의 끝에서부터 채워나간다.(두번째배열)
 */
public class QuFillArray {

	public static void main(String[] args) {
		// 첫 번째 배열
		int[] arr1 = new int[10];
		// 두 번째 배열
		int[] arr2 = new int[10];
		
		// 입력 받기
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(i + 1 + "번째 정수를 입력하세요.");
			int num = scanner.nextInt();
			arr1[i] = num;
		}
		
		System.out.println("순서대로 입력된 결과");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		// 두번째 배열
		int j = 0, k = arr2.length - 1;
		for(int i = 0; i < arr2.length; i++) {
			if(arr1[i] % 2 == 1) {
				arr2[j] = arr1[i];
				j++;
			} else {
				arr2[k] = arr1[i];
				k--;
			}
		}
		System.out.println("\n홀수/짝수 구분 입력된 결과");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		
		}
		
	}
}
